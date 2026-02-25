import java.util.Scanner;

public class DateCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Day:");
        int day = sc.nextInt();
        System.out.println("Month:");
        int month = sc.nextInt();

        boolean valid = false;

        if (month >= 1 && month <= 12) {

            if ((month == 1 || month == 3 || month == 5 || month == 7 ||
                    month == 8 || month == 10 || month == 12) && day <= 31)
                valid = true;

            else if ((month == 4 || month == 6 || month == 9 || month == 11) && day <= 30)
                valid = true;

            else if (month == 2 && day <= 28)
                valid = true;
        }

        if (valid && day >= 1)
            System.out.println("Valid Date");
        else
            System.out.println("Invalid Date");
    }
}