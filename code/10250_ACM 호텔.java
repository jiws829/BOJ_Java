import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int h, w, n;

        for (int i=0; i<num; i++) {
            h = sc.nextInt();
            w = sc.nextInt();
            n = sc.nextInt();

            int horizontal = ((n - 1) / h) + 1;
            int floor = n % h;

            if (floor == 0) floor = h;

            System.out.printf("%d%02d\n", floor, horizontal);
        }
    }
}
