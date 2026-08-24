import java.util.Scanner;

public class pattern03 {

  static void print3(int n) {
    for (int i=1; i <= n; i++) {
      for (int j=1; j <= i ; j++){
        System.out.print(j);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value n: ");
    n = sc.nextInt();
    print3(n);
    sc.close();
  }
  
}
