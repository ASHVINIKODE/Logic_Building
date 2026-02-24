import java.util.Scanner;

public class hoursampm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter hour and minute:");
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        if (hour >= 0 && hour < 12) {
            System.out.println("AM");
        } else if (hour >= 12 && hour < 24) {
            System.out.println("PM");
        } else {
            System.out.println("Invalid Time");
        }
    }
}