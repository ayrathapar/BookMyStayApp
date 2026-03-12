/**
 * MAIN CLASS - UseCase12DataPersistenceRecovery
 */

public class UseCase12DataPersistenceRecovery {

    public static void main(String[] args) {

        System.out.println("System Recovery");

        RoomInventory inventory = new RoomInventory();

        FilePersistenceService persistenceService =
                new FilePersistenceService();

        String filePath = "inventory.txt";

        persistenceService.loadInventory(inventory, filePath);

        System.out.println("\nCurrent Inventory:");

        for (String type : inventory.getRoomAvailability().keySet()) {

            System.out.println(
                    type + ": " +
                            inventory.getRoomAvailability().get(type)
            );
        }

        persistenceService.saveInventory(inventory, filePath);
    }
}