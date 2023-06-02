import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[31];
        int x;

        for (int i=0; i<28; i++) {
            x = sc.nextInt();
            array[x] = 1;
        }

        for (int i=1; i<=30; i++) {
            if (array[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
