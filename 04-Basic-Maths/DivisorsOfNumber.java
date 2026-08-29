import java.util.*;

public class DivisorsOfNumber {

    //1. Method
//    static void divisors(int n) {
//
//        for (int i = 1; i <= n ; i++) {
//            if ( n % i == 0 ) {
//                System.out.print(i + " ");
//            }
//        }
//    }

    // 2. Method return in array/list
    static int[] divisors(int n) {

        ArrayList<Integer> list = new ArrayList<>();

//        for(int i = 1 ; i <= n ; i++){
//            if( n % i == 0) {
//                list.add(i);
//            }
//        }

        // Different looping 1 to root n.
        for(int i = 1 ; i <= Math.sqrt(n) ; i++){

            if ( n%i == 0) {
                list.add(i);

                if(i != n/i) {
                    list.add(n/i);
                }
            }
        }

        int[] array = new int[list.size()];

        for(int i = 0 ; i < list.size() ; i++){
            array[i] = list.get(i) ;
        }

        Arrays.sort(array);
        return array;
    }


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        System.out.println(Arrays.toString(divisors(n)));
    }
}
