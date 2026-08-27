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
        Deque<Integer> dq1 = new ArrayDeque<>();

        //adding element to stack
        dq1.push(30);
        dq1.push(45);
        dq1.push(65);
        System.out.println(dq1);

        //removing element from stack
        dq1.pop();
        System.out.println(dq1);

        //View element in stack
        System.out.println("First element is " + dq1.peekFirst());
        System.out.println("Last element is " + dq1.peekLast());

        //size of the stack
        System.out.println(dq1.size());


    }
}
