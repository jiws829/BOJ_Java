import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, w, h;

        x = sc.nextInt();
        y = sc.nextInt();
        w = sc.nextInt();
        h = sc.nextInt();

        int min = 1001;
        if (min > w - x) min = w - x;
        if (min > x) min = x;
        if (min > h - y) min = h - y;
        if (min > y) min = y;

        System.out.println(min);
    }
}
