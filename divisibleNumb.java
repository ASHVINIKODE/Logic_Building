package Logic_Building;

import java.util.Scanner;

public class divisibleNumb {
    // Check if a number is divisible by both 3 and 5.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println(num + " is divided by both 5 and 3");
        } else if (num % 3 == 0 && num % 5 != 0) {
            System.out.println(num + " is divided by 3 only not 5");
        } else if (num % 5 == 0 && num % 3 != 0) {
            System.out.println(num + " is divided by 5 only not 3");
        } else {
            System.out.println(num + " is not divisible by 3 ad 5");
        }
    }
}
