/*

A B C D E 
A B C D 
A B C 
A B 
A 

*/
import java.util.Scanner;

public class pattern15 {
  static void print15(int n){
    for(int i = n; i > 0; i--){
      for(char ch = 'A'; ch < 'A'+ i ; ch++ ){
        System.out.print(ch + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the n : ");
    int n = sc.nextInt();
    print15(n);
    sc.close();
  }
}