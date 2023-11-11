import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = new String[5];
        String answer = "";
        int max_length = -1;

        for (int i = 0; i < 5; i++) {
            str[i] = sc.next();

            if (max_length < str[i].length()) {
                max_length = str[i].length();
            }
        }

        for (int j = 0; j < max_length; j++) {
            for (int i = 0; i < 5; i++) {
                if (j < str[i].length()) {
                    answer += str[i].charAt(j);
                }
            }
        }

        System.out.println(answer);
    }
}
