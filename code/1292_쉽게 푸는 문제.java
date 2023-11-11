import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        int num = 1;
        int num_count = 0;
        int sum = 0;

        for (int i = 1; i < a; i++) {
            num_count++;
            if (num_count == num) {
                num++;
                num_count = 0;
            }
        }

        for (int i = a; i <= b; i++) {
            sum += num;
            num_count++;
            if (num_count == num) {
                num++;
                num_count = 0;
            }
        }

        System.out.println(sum);
    }
}
