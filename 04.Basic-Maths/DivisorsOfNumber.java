import java.util.*;

public class DivisorsOfNumber {

//    static void divisors(int n) {
//
//        for (int i = 1; i <= n ; i++) {
//            if ( n % i == 0 ) {
//                System.out.print(i + " ");
//            }
//        }
//    }

    // return in array/list
    static int[] divisors(int n) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1 ; i <= n ; i++){
            if( n % i == 0) {
                list.add(i);
            }
        }

        int[] array = new int[list.size()];

        for(int i = 0 ; i < list.size() ; i++){
            array[i] = list.get(i) ;
        }
        return array;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numeber : ");
        int n = sc.nextInt();

        System.out.print(Arrays.toString(divisors(n)));
    }
}
