import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int reverse_a = (a % 10) * 100 + (a / 10 % 10) * 10 + (a / 100);
        int reverse_b = (b % 10) * 100 + (b / 10 % 10) * 10 + (b / 100);

        if (reverse_a > reverse_b) System.out.println(reverse_a);
        else System.out.println(reverse_b);
    }
}
