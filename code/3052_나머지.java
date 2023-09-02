import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, count = 0;
        int[] remainder = new int[42];

        for (int i = 0; i < 10; i++) {
            n = sc.nextInt();

            remainder[n % 42]++;
        }

        for (int i = 0; i < 42; i++) {
            if (remainder[i] > 0) count++;
        }
        System.out.println(count);
    }
}
