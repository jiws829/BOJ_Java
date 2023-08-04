import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] inputs = input.split(" ");

        String a = inputs[0];
        String b = inputs[1];

        int[] answer = new int[10003];
        int cnt = 0;
        int i, j;


        for (i=a.length()-1; i>=0; i--) {
            answer[cnt] = a.charAt(i) - '0';
            cnt += 1;
        }

        cnt = 0;
        for (i=b.length()-1; i>=0; i--) {
            answer[cnt] += b.charAt(i) - '0';
            cnt += 1;
        }

        // 자리 올림
        for (i=0; i<10003; i++) {
            if (answer[i] >= 10) {
                answer[i] -= 10;
                answer[i + 1] += 1;
            }
        }

        // 출력
        for (i=10002; i>=0; i--) {
            if (answer[i] != 0) break;
        }

        for (j=i; j>=0; j--) System.out.print(answer[j]);
    }
}
