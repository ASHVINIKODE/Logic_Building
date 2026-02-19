import java.util.Scanner;

public class MultipleOrEndsWith7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        if (num % 7 == 0 || num % 10 == 7) {
            System.out.println("Condition satisfied");
        } else {
            System.out.println("Condition not satisfied");
        }
    }
}
