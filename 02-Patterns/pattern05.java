import java.util.Scanner;

public class pattern05 {
  static void print5(int n) {
    for (int i=n; i > 0; i--) {
      for (int j=1; j <= i ; j++){
        System.out.print("*"+ " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value n: ");
    n = sc.nextInt();
    print5(n);
    sc.close();
  }
}
