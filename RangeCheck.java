import java.util.Scanner;

public class RangeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        if (num >= 100 && num <= 999) {
            System.out.println("Number is within range ");
        } else {
            System.out.println("not in range");
        }
    }
}
