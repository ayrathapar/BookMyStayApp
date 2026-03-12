import java.util.HashMap;
import java.util.Map;

/**
 * =========================================================
 * CLASS - RoomInventory
 * =========================================================
 *
 * Use Case 3: Centralized Room Inventory Management
 *
 * @version 3.1
 */

public class RoomInventory {

    /**
     * Stores available room count for each room type
     */
    private Map<String, Integer> roomAvailability;

    /**
     * Constructor initializes inventory
     */
    public RoomInventory() {
        roomAvailability = new HashMap<>();
        initializeInventory();
    }

    /**
     * Initializes room availability
     */
    private void initializeInventory() {

        roomAvailability.put("Single", 5);
        roomAvailability.put("Double", 3);
        roomAvailability.put("Suite", 2);
    }

    /**
     * Returns inventory map
     */
    public Map<String, Integer> getRoomAvailability() {
        return roomAvailability;
    }

    /**
     * Updates room availability
     */
    public void updateAvailability(String roomType, int count) {
        roomAvailability.put(roomType, count);
    }
}