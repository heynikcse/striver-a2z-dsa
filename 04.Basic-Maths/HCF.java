import java.util.*;

public class HCF {

    static  void print_hcf(int a , int b) {
         int hcf = 1;
         for(int i = 1 ; i <= Math.min(a, b) ; i++) {
             if ( (a%i == 0) && (b%i == 0) ){
                 hcf = i ;
             }
         }
        System.out.println(hcf);
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        print_hcf(a,b);
    }
}
