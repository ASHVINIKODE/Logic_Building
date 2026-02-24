import java.util.Scanner;

public class PerfectSquareCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        boolean flag = false;
        for (int i = 1; i <= num; i++) {
            if (i * i == num) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Perfect Square");
        } else {
            System.out.println("Not perfect square");
        }
    }
}
