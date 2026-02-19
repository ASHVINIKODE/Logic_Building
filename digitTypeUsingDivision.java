import java.util.Scanner;

public class digitTypeUsingDivision {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        num = Math.abs(num);
        int count = 0;
        if (num == 0) {
            count = 1;
        }
        ;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        if (count == 1) {
            System.out.println("Single digt");
        } else if (count == 2) {
            System.out.println("double digit");
        } else {
            System.out.println("Multiple digit");
        }
    }

}
