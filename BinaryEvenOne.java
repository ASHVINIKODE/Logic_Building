
import java.util.Scanner;

public class BinaryEvenOne {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            int num = i;
            int count = 0;

            while (num > 0) {
                if (num % 2 == 1) {
                    count++;
                }
                num = num / 2;
            }

            if (count % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
