import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int time = sc.nextInt();
        int a, b, c;

        a = time / 300;
        time %= 300;

        b = time / 60;
        time %= 60;

        c = time / 10;
        time %= 10;

        if (time == 0) System.out.printf("%d %d %d\n", a, b, c);
        else System.out.println("-1");

    }
}
