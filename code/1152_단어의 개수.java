import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String str_trimmed = str.trim();
        String[] splits = str_trimmed.split(" ");

        System.out.println(splits.length);
    }
}
