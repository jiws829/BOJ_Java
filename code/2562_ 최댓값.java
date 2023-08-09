import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int max = -1000001, position = -1;

        for (int i=1; i<=9; i++) {
            num = sc.nextInt();

            if (max < num) {
                max = num;
                position = i;
            }

        }

        System.out.println(max);
        System.out.println(position);
    }
}
