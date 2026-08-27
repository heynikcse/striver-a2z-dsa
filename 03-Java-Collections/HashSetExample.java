import java.util.*;

public class HashSetExample {
    static void main(String[] args) {

        //SO UNORDERED SET == HASHSET

        Set<Integer> st = new HashSet<>();

        st.add(10);
        st.add(25);
        st.add(15);
        st.add(10);
        st.add(35);

        System.out.println(st);

        st.remove(10);
        st.remove(25);
        System.out.println(st);

        System.out.println(st.contains(15));

        //USED TO FIND DUPLICATED IN ARRAY EXAMPLE

        int[] arr = {1, 2, 3, 2, 5};

        Set<Integer> seen = new HashSet<>();

        for(int x : arr) {

            if(seen.contains(x)) {
                System.out.println("Duplicate found: " + x);
                break;
            }
            seen.add(x);
        }
    }
}
