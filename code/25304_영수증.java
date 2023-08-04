import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int all_price = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;

        for (int i=0; i<n; i++) {
            int price = sc.nextInt();
            int num = sc.nextInt();

            sum += price * num;
        }

        if (all_price == sum) System.out.println("Yes");
        else System.out.println("No");
    }
}
