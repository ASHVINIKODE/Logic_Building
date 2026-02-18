import java.util.Scanner;

public class checkAlphabetRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet:");
        char ch = sc.next().charAt(0);
        if ((ch >= 'a' && ch <= 'm') || (ch >= 'A' && ch <= 'M')) {
            System.out.println("It lies between A to M");
        } else if ((ch >= 'n' && ch <= 'z') || (ch >= 'N' && ch <= 'Z')) {
            System.out.println("it lies between N to Z");
        } else {
            System.out.println("invalid input");
        }
    }
}
