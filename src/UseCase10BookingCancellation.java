/**
 * MAIN CLASS - UseCase10BookingCancellation
 */

public class UseCase10BookingCancellation {

    public static void main(String[] args) {

        System.out.println("Booking Cancellation");

        RoomInventory inventory = new RoomInventory();
        CancellationService cancellationService = new CancellationService();

        String reservationId = "Single-1";

        cancellationService.registerBooking(reservationId, "Single");

        cancellationService.cancelBooking(reservationId, inventory);

        cancellationService.showRollbackHistory();

        int updatedAvailability =
                inventory.getRoomAvailability().get("Single");

        System.out.println(
                "\nUpdated Single Room Availability: "
                        + updatedAvailability
        );
    }
}