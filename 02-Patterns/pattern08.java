/*

 ********* 
  *******  
   *****   
    ***    
     *  
     
*/
import java.util.Scanner;

public class pattern08 {
  static void print8(int n) {
    for (int i=0; i < n; i++) {
      
      for(int j=0; j <= i ; j++) {
        System.out.print(" ");
      }
      for(int k = 1 ; k <= 2*n-(2*i+1) ; k++) {
        System.out.print("*");
      }
      for(int j=0; j <= i ; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value n: ");
    n = sc.nextInt();
    print8(n);
    sc.close();
  }

}
