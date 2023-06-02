import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, x;
        int[] num_list = new int[10001];

        n = sc.nextInt();
        x = sc.nextInt();
        for (int i=0; i<n; i++) num_list[i] = sc.nextInt();

        for (int i=0; i<n; i++) {
            if (num_list[i] < x) {
                System.out.printf("%d ", num_list[i]);
            }
        }
    }
}
