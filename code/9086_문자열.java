import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();

        sc.nextLine();  // 입력 버퍼 비우기

        for (int i=0; i<n; i++) {
            String str = sc.nextLine();

            char start_chr = str.charAt(0);
            char end_chr = str.charAt(str.length() - 1);

            System.out.printf("%c%c\n", start_chr, end_chr);
        }
    }
}
