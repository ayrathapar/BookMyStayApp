import java.util.*;

/**
 * =====================================================
 * CLASS - RoomAllocationService
 * =====================================================
 *
 * Use Case 6: Reservation Confirmation & Room Allocation
 *
 * Confirms booking requests and assigns rooms safely.
 *
 * @version 6.0
 */

public class RoomAllocationService {

    // Prevent duplicate room IDs
    private Set<String> allocatedRoomIds;

    // Track rooms by type
    private Map<String, Set<String>> assignedRoomsByType;

    public RoomAllocationService() {

        allocatedRoomIds = new HashSet<>();
        assignedRoomsByType = new HashMap<>();

        assignedRoomsByType.put("Single", new HashSet<>());
        assignedRoomsByType.put("Double", new HashSet<>());
        assignedRoomsByType.put("Suite", new HashSet<>());
    }

    public void allocateRoom(Reservation reservation, RoomInventory inventory) {

        String roomType = reservation.getRoomType();

        Map<String, Integer> availability = inventory.getRoomAvailability();

        if (availability.get(roomType) <= 0) {
            System.out.println("No rooms available for " + roomType);
            return;
        }

        String roomId = generateRoomId(roomType);

        allocatedRoomIds.add(roomId);
        assignedRoomsByType.get(roomType).add(roomId);

        int updated = availability.get(roomType) - 1;
        inventory.updateAvailability(roomType, updated);

        System.out.println(
                "Booking confirmed for Guest: "
                        + reservation.getGuestName()
                        + ", Room ID: "
                        + roomId
        );
    }

    private String generateRoomId(String roomType) {

        int count = assignedRoomsByType.get(roomType).size() + 1;

        return roomType + "-" + count;
    }
}