import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, result;
        int[] cnt = new int[10];

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        result = a * b * c;
        while (result > 0) {
            cnt[result % 10]++;
            result /= 10;
        }

        for (int i = 0; i < 10; i++) System.out.println(cnt[i]);
    }
}
