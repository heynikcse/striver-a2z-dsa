// HARDCODED FOR TILL N=4 

// if( i==0 || i==2*n-2 || j==0 || j==2*n-2 ){
//   System.out.print(n + " ");
// } else if ( i==1 || i==2*n-3 || j==1 || j==2*n-3 ){
//   System.out.print(n-1 + " ");
// } else if ( i==2 || i==2*n-4 || j==2 || j==2*n-4 ){
//   System.out.print(n-2 + " ");
// } else if (i==3 || i==2*n-5 || j==3 || j==2*n-5){
//   System.out.print(n-3 + " ");
// }

/*

555555555
544444445
543333345
543222345
543212345
543222345

*/


import java.util.*;

public class pattern22 {
  static void print22(int n){
    for(int i = 0 ; i < 2*n -1 ; i++) {
      for (int j = 0 ; j < 2*n -1 ; j++) {

        int top = i;
        int left = j;
        int right = (2*n-2)-j;
        int down = (2*n-2)-i;

        System.out.print(n - Math.min( 
          Math.min(top, down) , 
          Math.min(left, right)
        ));

      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the n : ");
    int n = sc.nextInt();
    print22(n);
    sc.close();
  }
}
