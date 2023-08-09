import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, num;
        int max = -1000001, min = 1000001;

        n = sc.nextInt();
        for (int i=0; i<n; i++) {
            num = sc.nextInt();

            if (max < num) max = num;
            if (min > num) min = num;
        }

        System.out.printf("%d %d\n", min, max);
    }
}
