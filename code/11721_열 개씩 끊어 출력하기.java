import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            System.out.print(c);
            if ((i + 1) % 10 == 0) {
                System.out.printf("\n");
            }
        }
    }
}
