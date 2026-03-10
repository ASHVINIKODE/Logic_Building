
public class Multiple3 {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            int num = i;
            int sum = 0;

            while (num > 0) {
                int d = num % 10;
                sum = sum + d;
                num = num / 10;
            }

            if (sum % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
