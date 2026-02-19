import java.util.Scanner;

public class CurrencyCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount:");
        int amount = sc.nextInt();
        if (amount % 100 == 0) {
            System.out.println("Amount can be divided into 2000,500 and 100");
        } else {
            System.out.println("Amount cannot be divided");
        }
    }
}
