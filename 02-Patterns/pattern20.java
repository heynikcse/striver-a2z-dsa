/*

*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

*/


import java.util.Scanner;

public class pattern20 {
  static void print20(int n){
    for (int i = 0 ; i < 2*n-1 ; i++){
      
      int star = i ;
      int space = 2*(n-i-1) ;

      if (i > n-1 ){
        star = 2*n-i-2 ;
        space = (2*i+2)-2*n ;
      } 

      for(int j = 0 ; j <= star ; j++) {
        System.out.print("*");
      }

      for(int k = 0; k < space ; k++){
        System.out.print(" ");
      }

      for(int j = 0 ; j <= star ; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the n : ");
    int n = sc.nextInt();
    print20(n);
    sc.close();
  }
}
