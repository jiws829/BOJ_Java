import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ox;
        int n;
        int total_score, score;

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            ox = sc.next();

            total_score = 0;
            score = 0;
            for (int j = 0; j < ox.length(); j++) {
                if (ox.charAt(j) == 'O') {
                    score++;
                    total_score += score;
                } else {
                    score = 0;
                }
            }

            System.out.println(total_score);
        }
    }
}
