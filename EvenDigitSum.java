
public class EvenDigitSum {

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            int num = i;
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                sum = sum + digit;
                num = num / 10;
            }
            if (sum % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
