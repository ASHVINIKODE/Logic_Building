import java.util.Scanner;

public class WeekCheck {
    public static void main(String[] args) {
        // Take a weekday number (1–7) and determine if it is a weekday or weekend.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the week number:");
        int n = sc.nextInt();
        switch (n) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekday");
                break;
            case 6:
            case 7:
                System.out.println("weekend");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
