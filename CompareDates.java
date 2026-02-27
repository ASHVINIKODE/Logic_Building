
import java.util.Scanner;

public class CompareDates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first date and month:");
        int d1 = sc.nextInt();
        int m1 = sc.nextInt();
        System.out.println("Enter the second date and month:");
        int d2 = sc.nextInt();
        int m2 = sc.nextInt();

        if (m1 < m2 || (m1 == m2 && d1 < d2)) {
            System.out.println("First date comes earlier");
        } else {
            System.out.println("Second date comes earlier");
        }
    }
}
