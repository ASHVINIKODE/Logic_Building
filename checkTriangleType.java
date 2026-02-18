import java.util.Scanner;

public class checkTriangleType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side:");
        int a = sc.nextInt();
        System.out.println("Enter the second side:");
        int b = sc.nextInt();
        System.out.println("Enter the third side:");
        int c = sc.nextInt();
        if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && c + b > a) {
            if (a == b && b == c) {
                System.out.println("Equilateral triangle");
            } else if (a == b || b == c || c == a) {
                System.out.println("Isosceles triangle");
            } else {
                System.out.println("Scalene triangle");
            }

        } else {
            System.out.println("Invalid triangle");
        }
    }
}
