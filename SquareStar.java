import java.util.Scanner;

public class SquareStar {

    // Prints one row of n stars
    static void row(int n) {
        if (n == 0) {
            return;
        }
        System.out.print("*");
        row(n - 1);
    }

    // Prints n rows of stars
    static void square(int n, int size) {
        if (n == 0) {
            return;
        }
        row(size);          // always print 'size' stars
        System.out.println();
        square(n - 1, size); // recursive call for remaining rows
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        square(n, n); // pass n twice: rows and columns
    }
}
