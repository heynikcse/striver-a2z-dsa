/*
   A   
  ABA  
 ABCBA 
ABCDCBA

 */

import java.util.Scanner;

public class pattern17 {
  static void print17(int n){
    for(int i = 0; i < n; i++){
      
      for(int j = 0; j < n-i-1 ; j++){
        System.out.print(" ");
      }

      char ch = 'A';
      int breakpoint = (2*i+1) / 2 ;
      for(int k=1 ; k <= 2*i+1 ; k++){
        System.out.print(ch);
        if (k <= breakpoint) {
          ch ++;
        } else {
          ch --;
        }
      }

      for(int j = 0; j < n-i-1 ; j++){
        System.out.print(" ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the n : ");
    int n = sc.nextInt();
    print17(n);
    sc.close();
  }
}
