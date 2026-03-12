import java.util.*;

/**
 * =====================================================
 * CLASS - AddOnServiceManager
 * =====================================================
 *
 * Manages optional services for reservations.
 *
 * @version 7.0
 */

public class AddOnServiceManager {

    private Map<String, List<Service>> servicesByReservation;

    public AddOnServiceManager() {
        servicesByReservation = new HashMap<>();
    }

    public void addService(String reservationId, Service service) {

        servicesByReservation
                .computeIfAbsent(reservationId, k -> new ArrayList<>())
                .add(service);
    }

    public double calculateTotalServiceCost(String reservationId) {

        List<Service> services = servicesByReservation.get(reservationId);

        if (services == null) {
            return 0;
        }

        double total = 0;

        for (Service service : services) {
            total += service.getCost();
        }

        return total;
    }
}