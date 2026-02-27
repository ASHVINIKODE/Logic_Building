
import java.util.Scanner;

public class Century {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = sc.nextInt();

        int century = (year + 99) / 100;

        System.out.println(century + "th century");
    }
}
