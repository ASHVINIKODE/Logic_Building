package Logic_Building;

import java.util.Scanner;

public class threeLarger {
    public static void main(String[] args) {
        //Find Largest of Three Numbers
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = scan.nextInt();
        System.out.println("Enter the second number:");
        int b = scan.nextInt();
        System.out.println("Enter the third number:");
        int c = scan.nextInt();
        if (a >= b && a >= c) {
            System.out.println(a + " is larger ");
        } else if (b <= a && b >= c) {
            System.out.println(b + " is larger");
        } else {
            System.out.println(c + " is larger");
        }
    }
}
