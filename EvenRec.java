
import java.util.Scanner;

public class EvenRec {

    static void EvenNum(int n) {
        if (n == 0) {
            return;
        }
        EvenNum(n - 1);
        if (n % 2 == 0) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        EvenNum(n);
    }
}
