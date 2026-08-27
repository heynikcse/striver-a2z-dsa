import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(25);
        list.add(35);
        list.add(45);

        //Iterator
        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        //in hashset used to get element
        HashSet<Integer> hs = new HashSet<>();

        hs.add(22);
        hs.add(33);
        hs.add(44);

        Iterator<Integer> it2 = hs.iterator();

        while (it2.hasNext()) {
            int x = it2.next();
            System.out.print(x + " ");
        }
        System.out.println();

    }
}
