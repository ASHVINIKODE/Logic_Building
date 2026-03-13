
import java.util.Scanner;

public class LineStar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        star(n);

    }

    static void star(int n) {
        if (n == 0) {
            return;
        }
        System.out.print("*");
        star(n - 1);
    }
}
