import java.util.*;

public class DequeExample {
    static void main(String[] args) {
        //declare of deque
        Deque<Integer> dq = new ArrayDeque<>();

        // Add
        dq.addFirst(10);
        dq.addLast(20);
        dq.addFirst(5);
        dq.addLast(30);

        System.out.println(dq);

        // Front and back
        System.out.println("Front: " + dq.getFirst());
        System.out.println("Back: " + dq.getLast());

        // Remove
        dq.removeFirst();
        dq.removeLast();

        System.out.println(dq);

        //can behave like stack also
        dq.push(30);
        dq.push(45);
        dq.push(65);
        System.out.println(dq);

        dq.pop();
        System.out.println(dq);

    }
}
