import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, v, days;

        a = sc.nextInt();
        b = sc.nextInt();
        v = sc.nextInt();

        days = (int) (v - a) / (a - b);
        if ((v - a) % (a - b) != 0) {
            days++;
        }
        System.out.println(days + 1);
    }
}
