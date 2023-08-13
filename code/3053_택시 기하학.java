import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double width1 = n * n * Math.PI;
        double width2 = Math.pow((n * 2), 2) / 2;

        System.out.printf("%f\n%f\n", width1, width2);
    }
}
