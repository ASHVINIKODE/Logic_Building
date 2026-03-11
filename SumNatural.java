
import java.util.Scanner;

public class SumNatural {

    static int sumNum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumNum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumNum(n));
    }
}
