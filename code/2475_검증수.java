import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int a;
        for (int i=0; i<5; i++) {
            a = sc.nextInt();
            sum += a * a;
        }

        System.out.println(sum % 10);
    }
}
