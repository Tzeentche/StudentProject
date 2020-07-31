import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {

    public static void main(String[] args) {

        Queue queue = new LinkedList<>();
        Queue queue2 = new PriorityQueue<>();

        queue.offer("1");
        queue.offer(2);
        queue.offer("3");

        while (queue.size() > 0) {
            System.out.println(queue.poll());
        }
    }
}
