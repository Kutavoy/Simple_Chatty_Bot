import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int unit = scanner.nextInt();
    
    final int a = 1;
    final int b = 20;
    final int c = 250;
    final int d = 1000;

    if (unit < a) {
    System.out.println("no army");
    } else if (unit >= a && unit < b) {
    System.out.println("pack");
    } else if (unit >= b && unit < c) {
    System.out.println("throng");
    } else if (unit >= c && unit < d) {
    System.out.println("zounds");
    } else if (unit >= d) {
    System.out.println("legion");
    }
  }
}
