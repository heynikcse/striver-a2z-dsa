import java.util.*;

public class LinkedListExample {
    static void main(String[] args) {
        //declare a linkedlist
        LinkedList<Integer> list = new LinkedList<>();

        //add element
        list.add(22);
        list.add(30);
        list.add(45);
        list.add(50);
        System.out.println(list);

        //remove element from index
        list.remove(2);
        System.out.println(list);

        LinkedList<Integer> l = new LinkedList<>();

        //adding an element at last and first of list
        l.addLast(10);
        l.addLast(20);
        l.addFirst(5);
        l.add(30);
        System.out.println(l);

        //removing last and first element of list
        l.removeFirst();
        l.removeLast();
        System.out.println(l);

        System.out.println(l.getFirst());
        System.out.println(list.getFirst());
        System.out.println(l.getLast());
        System.out.println(list.getLast());

        //size of the list
        System.out.println(list.size());
        System.out.println(l.size());

        //inserting element at the index
        l.add(1,33);
        System.out.println(l);

        //Transversing

        for(int x: l) {
            System.out.print(x + " ");
        }
        System.out.println();

        for(int x: list) {
            System.out.print(x + " ");
        }
        System.out.println();


        //can also use iterator

        Iterator<Integer> it = l.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
