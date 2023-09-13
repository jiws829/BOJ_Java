import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int out, in;
        int count = 0, max = -1;

        for (int i = 0; i < 4; i++) {
            out = sc.nextInt();
            in = sc.nextInt();

            count -= out;
            if (max < count) max = count;

            count += in;
            if (max < count) max = count;
        }
        System.out.println(max);
    }
}
