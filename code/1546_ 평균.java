import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int[] score = new int[1000];
        int max = -1;

        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();

            if (max < score[i]) max = score[i];
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += (double) score[i] / max * 100;
        }

        System.out.println(sum / n);
    }
}
