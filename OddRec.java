
import java.util.Scanner;

public class OddRec {

    static void oddNum(int n) {

        if (n == 0) {
            return;
        }

        oddNum(n - 1);

        if (n % 2 != 0) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        oddNum(n);
    }
}
