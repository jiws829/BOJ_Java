import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;

        n = sc.nextInt();
        m = sc.nextInt();
        int[][] matrix = new int[n][m];

        for (int k=0; k<2; k++) {
            for (int i=0; i<n; i++) {
                for (int j=0; j<m; j++) matrix[i][j] += sc.nextInt();
            }
        }

        // 출력
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) System.out.printf("%d ", matrix[i][j]);
            System.out.printf("\n");
        }
    }
}
