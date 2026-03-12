
import java.util.Scanner;

public class DigitWordRec {

    static String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    static void printWord(int n) {

        if (n == 0) {
            return;
        }

        printWord(n / 10);

        int d = n % 10;
        System.out.print(word[d] + " ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printWord(n);
    }
}
