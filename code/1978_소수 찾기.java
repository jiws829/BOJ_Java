import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int prime_num_count = 0;

        for (int i=0; i<n; i++) {
            int num = sc.nextInt();

            if (isPrime(num) == true) prime_num_count ++;
        }

        System.out.println(prime_num_count);
    }

    public static boolean isPrime(int number) {
        if (number == 1) return false;

        if (number == 2) return true;
        if (number % 2 == 0) return false;

        for (int i=3; i*i<=number; i+=2) {
            if (number % i == 0) return false;
        }

        return true;
    }
}
