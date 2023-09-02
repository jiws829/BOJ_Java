import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int cnt, sum = 0, student_count = 0;
            int[] score = new int[1001];
            double avg;

            cnt = sc.nextInt();
            for (int j = 0; j < cnt; j++) {
                score[j] = sc.nextInt();
                sum += score[j];
            }
            avg = (double) sum / cnt;

            for (int j = 0; j < cnt; j++) {
                if (score[j] > avg) student_count++;
            }

            System.out.printf("%.3f%%\n", (double) student_count / cnt * 100);
        }
    }
}
