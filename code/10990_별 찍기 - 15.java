import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.printf(" ");
            System.out.printf("*");
            if (i == 1) System.out.println("");
            else if (i > 1) {
                for (int j = 1; j <= (i - 1) * 2 - 1; j++) System.out.printf(" ");
                System.out.printf("*\n");
            }
        }
    }
}
