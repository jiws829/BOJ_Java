import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m;
        int[] card = new int[100];
        int min = 10000001;  // 카드 최대값 * 카드 개수

        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 0; i < n; i++) card[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int diff = m - (card[i] + card[j] + card[k]);
                    if (diff >= 0 && min > diff) min = diff;
                }
            }
        }

        System.out.println(m - min);
    }
}
