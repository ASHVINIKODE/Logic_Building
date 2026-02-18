
import java.util.Scanner;

public class temperatureCheck {
    // Temperature Check (Range Conditions)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eenter the temperature:");
        int temp = sc.nextInt();
        if (temp < 15) {
            System.out.println("it is cold");
        } else if (temp >= 15 && temp <= 30) {
            System.out.println("it is warm");
        } else {
            System.out.println("It is hot");
        }
    }
}
