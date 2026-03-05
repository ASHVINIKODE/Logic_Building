
import java.util.Scanner;

public class numbersDivisibleBySevenBetween_a_and_b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}
