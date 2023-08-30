import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer, Integer> x_map = new HashMap<>();
        Map<Integer, Integer> y_map = new HashMap<>();
        int x, y;
        int x_answer = 0, y_answer = 0;

        for (int i = 0; i < 3; i++) {
            x = sc.nextInt();
            y = sc.nextInt();

            x_map.put(x, x_map.getOrDefault(x, 0) + 1);
            y_map.put(y, y_map.getOrDefault(y, 0) + 1);
        }

        for (int x_key : x_map.keySet()) {
            if (x_map.get(x_key) == 1) {
                x_answer = x_key;
                break;
            }
        }
        for (int y_key : y_map.keySet()) {
            if (y_map.get(y_key) == 1) {
                y_answer = y_key;
                break;
            }
        }
        System.out.printf("%d %d\n", x_answer, y_answer);
    }
}
