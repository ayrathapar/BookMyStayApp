import java.util.LinkedList;
import java.util.Queue;

/**
 * =====================================================
 * CLASS - BookingRequestQueue
 * =====================================================
 *
 * Use Case 5: Booking Request (FIFO)
 *
 * Manages booking requests using a queue.
 *
 * @version 5.0
 */

public class BookingRequestQueue {

    private Queue<Reservation> requestQueue;

    public BookingRequestQueue() {
        requestQueue = new LinkedList<>();
    }

    public void addRequest(Reservation reservation) {
        requestQueue.offer(reservation);
    }

    public Reservation getNextRequest() {
        return requestQueue.poll();
    }

    public boolean hasPendingRequests() {
        return !requestQueue.isEmpty();
    }
}