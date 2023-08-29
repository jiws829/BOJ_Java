import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] alphabet_position = new int[26];
        int i;

        // 초기화
        for (i = 0; i < 26; i++) alphabet_position[i] = -1;

        String str = sc.nextLine();

        for (i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (alphabet_position[c - 'a'] == -1) {
                alphabet_position[c - 'a'] = i;
            }
        }

        for (i = 0; i < 26; i++) System.out.printf("%d ", alphabet_position[i]);
    }
}
