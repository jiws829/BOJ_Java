import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        for (int i=0; i<3; i++) arr[i] = sc.nextInt();

        int answer = 0;

        // 정렬
        Arrays.sort(arr);

        if (arr[0] == arr[1] && arr[1] == arr[2]) answer = 10000 + 1000 * arr[0];
        else if (arr[0] == arr[1] || arr[1] == arr[2]) answer = 1000 + 100 * arr[1];
        else answer = 100 * arr[2];

        System.out.println(answer);
    }
}
