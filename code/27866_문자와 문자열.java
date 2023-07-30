import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int position = sc.nextInt();

        char answer = str.charAt(position - 1);
        System.out.println(answer);
    }
}
