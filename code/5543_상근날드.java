import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] hamburger = new int[3];
        int coke, cider;

        for (int i=0; i<3; i++) hamburger[i] = sc.nextInt();
        coke = sc.nextInt();
        cider = sc.nextInt();

        Arrays.sort(hamburger);
        int sum = hamburger[0];
        if (coke < cider) sum += coke;
        else sum += cider;
        sum -= 50;

        System.out.println(sum);
    }
}
