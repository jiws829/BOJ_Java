import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int num = n;
        int count = 0;

        while (true) {
            num = (num % 10) * 10 + (num / 10 + num % 10) % 10;
            count++;

            if (n == num) break;
        }
        System.out.println(count);
    }
}
