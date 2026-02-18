import java.util.Scanner;

public class multiple {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        if (a % b == 0 || b % a == 0) {
            System.out.println("one number is multiple of other");
        } else {
            System.out.println("not multiples");
        }
    }
}
