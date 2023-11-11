import java.util.Scanner;

public class Main {
    public static int FunctionGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int a, b;
        int aa, bb;

        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();

            int gcd = FunctionGCD(a, b);

            System.out.println(a * b / gcd);
        }
    }
}
