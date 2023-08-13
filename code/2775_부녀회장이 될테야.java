import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int k, n;

        for (int i = 0; i < t; i++) {
            k = sc.nextInt();
            n = sc.nextInt();

            int[][] arr = new int[k + 1][n + 1];

            for (int room_number = 1; room_number <= n; room_number++) {
                arr[0][room_number] = room_number;
            }

            for (int floor = 1; floor <= k; floor++) {
                for (int room_number = 1; room_number <= n; room_number++) {
                    for (int j = 1; j <= room_number; j++) arr[floor][room_number] += arr[floor - 1][j];
                }
            }

            System.out.println(arr[k][n]);
        }
    }
}
