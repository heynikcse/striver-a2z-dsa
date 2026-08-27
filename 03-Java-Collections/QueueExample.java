import java.util.*;

public class QueueExample {
    static void main(String[] args) {

        //Declare of queue
        Queue<Integer> q = new ArrayDeque<>();

        // Add
        q.offer(10);
        q.offer(20);
        q.offer(30);

        // See front
        System.out.println(q.peek());   // 10

        // Remove
        System.out.println(q.poll());   // 10

        // See new front
        System.out.println(q.peek());   // 20

        // Size
        System.out.println(q.size());   // 2
    }
}
