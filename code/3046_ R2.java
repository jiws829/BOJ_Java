import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, avg;
        a = sc.nextInt();
        avg = sc.nextInt();

        b = avg * 2 - a;

        System.out.println(b);
    }
}
