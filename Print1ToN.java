
import java.util.Scanner;

public class Print1ToN {
//Print numbers from 1 to n using recursion

    static void printNum(int n) {
        if (n == 0) {
            return;
        }
        printNum(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNum(n);
    }
}
