import java.util.Scanner;

public class GPCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("Enter the third number:");
        int c = sc.nextInt();

        if (b * b == a * c)
            System.out.println("Geometric Progression");
        else
            System.out.println("Not GP");
    }
}