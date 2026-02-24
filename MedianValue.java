import java.util.Scanner;

public class MedianValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a >= b && a <= c) || (a <= b && a >= c)) {
            System.out.println("Median:" + a);
        } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            System.out.println("Median:" + b);
        } else {
            System.out.println("Median:" + c);
        }
    }
}
