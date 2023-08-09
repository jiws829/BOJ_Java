import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        int sum = a * b;

        while (b > 0) {
            int b_value = b % 10;

            System.out.println(a * b_value);
            b /= 10;
        }
        System.out.println(sum);
    }
}
