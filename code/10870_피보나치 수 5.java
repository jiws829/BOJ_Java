import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 0) System.out.println("0");
        else if (n <= 2) System.out.println("1");
        else {
            int a, b, c;
            a = b = 1;
            c = 0;
            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println(c);
        }
    }
}
