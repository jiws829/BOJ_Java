import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();  // 입력 버퍼 지우기
        String str = sc.nextLine();

        int sum = 0;

        for (int i=0; i<n; i++) {
            int num = str.charAt(i) - '0';
            sum += num;
        }
        System.out.println(sum);
    }
}
