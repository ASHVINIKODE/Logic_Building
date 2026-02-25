import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password:");
        String pass = sc.nextLine();
        boolean hasDigit = false;
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isDigit(pass.charAt(i))) {
                hasDigit = true;
                break;
            }
        }
        if (pass.length() >= 8 && hasDigit) {
            System.out.println("Valid Password");
        } else {
            System.out.println("invalid Password");
        }
    }
}
