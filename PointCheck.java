import java.util.Scanner;

public class PointCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the X coordinate:");
        int x = sc.nextInt();
        System.out.println("Enter the Y coordinate:");
        int y = sc.nextInt();
        if (x == 0 && y == 0) {
            System.out.println("Point lies in origin");
        } else if (x == 0) {
            System.out.println("Point lies in a Y-Axis");
        } else if (y == 0) {
            System.out.println("Point lies in a X-Axis");
        } else {
            System.out.println("Point lies in Cartesian Plane");
        }
    }
}
