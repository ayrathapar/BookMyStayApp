/**
 * CLASS - BookingReportService
 * Use Case 8: Booking History & Reporting
 */

public class BookingReportService {

    public void generateReport(BookingHistory history) {

        System.out.println("\nBooking History Report");

        for (Reservation reservation : history.getConfirmedReservations()) {

            System.out.println(
                    "Guest: " + reservation.getGuestName() +
                            ", Room Type: " + reservation.getRoomType()
            );
        }
    }
}