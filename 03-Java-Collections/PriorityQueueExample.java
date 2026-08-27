import java.util.*;

public class PriorityQueueExample {
    static void main(String[] args) {

        //Declare priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(10);
        pq.offer(30);
        pq.offer(20);

        //Java is default PriorityQueue is a Min Heap.

//        System.out.println(pq.poll());
//        System.out.println(pq.poll());
//        System.out.println(pq.poll());

        //Max Heap
        //Declare of max heap
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());

        pq2.offer(5);
        pq2.offer(11);
        pq2.offer(8);

//        System.out.println(pq2.poll());
//        System.out.println(pq2.poll());
//        System.out.println(pq2.poll());

        //To get elements in priority order:

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }

        while(!pq2.isEmpty()){
            System.out.println(pq2.poll());
        }
    }
}
