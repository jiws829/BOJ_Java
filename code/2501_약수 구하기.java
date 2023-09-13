import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0, i;

        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (count == k) break;
            }
        }
        if (count < k) System.out.println("0");
        else System.out.println(i);
    }
}
