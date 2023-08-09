import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour, minute;
        int oven;
        hour = sc.nextInt();
        minute = sc.nextInt();
        oven = sc.nextInt();

        minute += oven;

        // 분 정리
        hour += minute / 60;
        minute %= 60;

        // 시 정리
        hour %= 24;

        System.out.printf("%d %d\n", hour, minute);
    }
}
