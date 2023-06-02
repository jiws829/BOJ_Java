import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, v;
        int[] nums = new int[101];
        int count = 0;

        n = sc.nextInt();
        for (int i=0; i<n; i++) nums[i] = sc.nextInt();
        v = sc.nextInt();

        for (int i=0; i<n; i++) {
            if (nums[i] == v) count++;
        }

        System.out.println(count);
    }
}
