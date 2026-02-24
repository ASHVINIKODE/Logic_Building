import java.util.Scanner;

public class TaxEligibility {
    public static void main(String[] args) {
        // Take income and age, and check if eligible for tax (age > 18 and income > 5
        // L)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the income: ");
        double income = sc.nextDouble();
        System.out.println("Enter the age:");
        int age = sc.nextInt();
        if (age > 18 && income > 500000) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }
}
