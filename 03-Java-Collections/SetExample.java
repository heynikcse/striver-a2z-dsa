import java.sql.SQLOutput;
import java.util.*;

public class SetExample {
    static void main(String[] args) {

        //Declare of set
        Set<Integer> st = new TreeSet<>();

        //adding element
        st.add(10);
        st.add(35);
        st.add(22);
        st.add(28);
        st.add(10);  // it gets ignored cause set do not allow duplicate

        System.out.println(st);   //Element sorted automatically without having duplicates

        //remove an element
        st.remove(10);
        System.out.println(st);

        //checking element in set
        System.out.println(st.contains(10));

        //size of set
        System.out.println(st.size());

        //Transversing a set
        for(int x : st) {
            System.out.print(x + " ");
        }
        System.out.println();


        //EXTRA METHODS

        TreeSet<Integer> st2 = new TreeSet<>();

        st2.add(5);
        st2.add(10);
        st2.add(20);
        st2.add(30);
        st2.add(40);

        System.out.println(st2.first());

        System.out.println(st2.last());

        System.out.println(st2.higher(20)); // Gives the smallest element greater than the value

        System.out.println(st2.lower(20)); // Gives the largest element smaller than the value


    }
}
