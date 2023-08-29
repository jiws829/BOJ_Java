import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {  // 대문자
                count[c - 'A']++;
            } else {  // 소문자
                count[c - 'a']++;
            }
        }

        int max_count = -1;
        char max_alphabet = '?';

        for (int i = 0; i < 26; i++) {
            if (max_count < count[i]) {
                max_count = count[i];
                max_alphabet = (char) ('A' + i);
            } else if (max_count == count[i]) {
                max_alphabet = '?';
            }
        }

        System.out.println(max_alphabet);
    }
}
