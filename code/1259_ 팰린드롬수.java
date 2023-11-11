import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;
        int start, end;
        int flag;

        while(true) {
            str = sc.next();
            if (str.equals("0")) break;

            start = 0;
            end = str.length() - 1;
            flag = 0;

            while(start <= end) {
                if (str.charAt(start) != str.charAt(end)) {
                    flag = 1;
                    break;
                }

                start ++;
                end --;
            }

            if (flag == 0) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
