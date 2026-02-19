import java.util.Scanner;

public class ThirdAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first angle:");
        int a = sc.nextInt();
        System.out.println("Enter the second angle:");
        int b = sc.nextInt();
        int c = 180 - (a + b);
        if (c > 0) {
            System.out.println("Third angle: " + c);
        } else {
            System.out.println("invalid triangle");
        }

    }
}
