import java.util.Scanner;

public class greetingBasedonHour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(("Enter hour:"));
        int x = sc.nextInt();
        if (x >= 5 && x < 12) {
            System.out.println("Good Morning");
        } else if (x >= 12 && x < 17) {
            System.out.println("Good Afternoon");
        } else if (x >= 17 && x < 21) {
            System.out.println("Good Evening");
        } else if (x >= 0 && x < 24) {
            System.out.println("Good Night");
        } else {
            System.out.println("Invalid hour");
        }
    }
}
