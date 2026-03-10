
import java.util.Scanner;

public class DigitMinMax {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int small = 9;
        int large = 0;

        while (n > 0) {
            int d = n % 10;

            if (d < small) {
                small = d;
            }

            if (d > large) {
                large = d;
            }

            n = n / 10;
        }

        System.out.println("Smallest: " + small);
        System.out.println("Largest: " + large);
    }
}
