/**
 * CLASS - ReservationValidator
 * Use Case 9: Error Handling & Validation
 */

import java.util.Map;

public class ReservationValidator {

    public void validate(
            String guestName,
            String roomType,
            RoomInventory inventory
    ) throws InvalidBookingException {

        if (guestName == null || guestName.trim().isEmpty()) {
            throw new InvalidBookingException("Guest name cannot be empty.");
        }

        if (!(roomType.equals("Single") ||
                roomType.equals("Double") ||
                roomType.equals("Suite"))) {

            throw new InvalidBookingException("Invalid room type selected.");
        }

        Map<String, Integer> availability = inventory.getRoomAvailability();

        if (availability.get(roomType) <= 0) {
            throw new InvalidBookingException("Selected room type not available.");
        }
    }
}