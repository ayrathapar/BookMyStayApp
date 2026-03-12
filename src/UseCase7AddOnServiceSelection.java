/**
 * =====================================================
 * MAIN CLASS - UseCase7AddOnServiceSelection
 * =====================================================
 *
 * Demonstrates attaching optional services
 * to a reservation.
 *
 * @version 7.0
 */

public class UseCase7AddOnServiceSelection {

    public static void main(String[] args) {

        System.out.println("Add-On Service Selection");

        String reservationId = "Single-1";

        AddOnServiceManager serviceManager = new AddOnServiceManager();

        Service breakfast = new Service("Breakfast", 500);
        Service spa = new Service("Spa", 1000);

        serviceManager.addService(reservationId, breakfast);
        serviceManager.addService(reservationId, spa);

        double totalCost = serviceManager.calculateTotalServiceCost(reservationId);

        System.out.println("Reservation ID: " + reservationId);
        System.out.println("Total Add-On Cost: " + totalCost);
    }
}