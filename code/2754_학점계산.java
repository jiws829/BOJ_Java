import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double score = 0.0;

        String grade = sc.nextLine();
        char alphabet = grade.charAt(0);

        switch(alphabet) {
            case 'A': score = 4.0; break;
            case 'B': score = 3.0; break;
            case 'C': score = 2.0; break;
            case 'D': score = 1.0; break;
            case 'F': score = 0.0; break;
        }

        if (grade.length() > 1) {
            char sign = grade.charAt(1);
            if (sign == '+') score += 0.3;
            else if (sign == '-') score -= 0.3;
        }

        System.out.printf("%.1f", score);
    }
}
