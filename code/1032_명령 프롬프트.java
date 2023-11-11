import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        String[] str = new String[50];
        String answer = "";

        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        char temp;
        int flag;
        for (int j = 0; j < str[0].length(); j++) {
            temp = str[0].charAt(j);
            flag = 0;

            for (int i = 1; i < n; i++) {
                if (temp != str[i].charAt(j)) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 1) answer += "?";
            else answer += temp;
        }

        System.out.println(answer);
    }
}
