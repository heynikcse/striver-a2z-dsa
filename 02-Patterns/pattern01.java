import java.util.Scanner;

public class pattern01 {

  static void print1(int n){
    for (int i = 0; i < n ; i++) {
      for (int j = 0; j < n ; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value n: ");
    n = sc.nextInt();
    print1(n);
    sc.close();
  }
}