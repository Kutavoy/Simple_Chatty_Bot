import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int e = --a;
        int f = --b;
        int g = --c;
        int h = --d;


        System.out.print(e + " " + f + " " + g + " " + h);
    }
}