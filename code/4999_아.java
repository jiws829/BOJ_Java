import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String doctor = sc.nextLine();

        if (str.length() >= doctor.length()) System.out.println("go");
        else System.out.println("no");
    }
}
