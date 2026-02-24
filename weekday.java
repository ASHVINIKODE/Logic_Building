import java.util.Scanner;

public class weekday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the day number:");
        int n = sc.nextInt();
        if (n >= 1 && n <= 5) {
            System.out.println("Weekday");
        } else if (n == 6 || n == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid input");
        }
    }
}
