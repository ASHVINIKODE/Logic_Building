
import java.util.Scanner;

public class DigitSumRec {

    static int sumDigit(int n) {

        if (n == 0) {
            return 0;
        }

        return (n % 10) + sumDigit(n / 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(sumDigit(n));
    }
}
