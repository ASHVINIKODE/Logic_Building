
public class Palindrome1 {

    public static void main(String[] args) {

        for (int i = 1; i <= 500; i++) {

            int num = i;
            int rev = 0;

            while (num > 0) {
                int d = num % 10;
                rev = rev * 10 + d;
                num = num / 10;
            }

            if (i == rev) {
                System.out.println(i);
            }
        }
    }
}
