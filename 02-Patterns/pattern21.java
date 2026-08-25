/*

****
*  *
*  *
****

*/

import java.util.Scanner;

public class pattern21 {
  static void print21(int n){
    for(int i=0 ; i < 1 ; i++) {
      for(int j = 0; j < n ; j++){
        System.out.print("*");
      }
      System.out.println();
    }

    for(int i = 0 ; i < n-2 ; i++){
      for(int j = 0 ; j < 1 ; j++){
        System.out.print("*");
      }
      for(int k = 0 ; k < n-2 ; k++){
        System.out.print(" ");
      }
      for(int j = 0 ; j < 1 ; j++){
        System.out.print("*");
      }
      System.out.println();
    }

    for(int i=0 ; i < 1 ; i++) {
      for(int j = 0; j < n ; j++){
        System.out.print("*");
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the n : ");
    int n = sc.nextInt();
    print21(n);
    sc.close();
  }
}
