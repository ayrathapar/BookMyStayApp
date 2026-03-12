/**
 * =====================================================
 * MAIN CLASS - UseCase4RoomSearch
 * =====================================================
 *
 * Demonstrates how guests can view available rooms.
 *
 * @version 4.0
 */

public class UseCase4RoomSearch {

    public static void main(String[] args) {

        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        RoomInventory inventory = new RoomInventory();

        RoomSearchService searchService = new RoomSearchService();

        searchService.searchAvailableRooms(
                inventory,
                singleRoom,
                doubleRoom,
                suiteRoom
        );
    }
}