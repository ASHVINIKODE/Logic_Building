public class StarsAndSpaces {
    public static void main(String[] args) {
        int n = 5; // number of rows

        for (int i = 0; i < n; i++) {
            // Print leading 'b' characters
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("b");
            }

            // Print alternating '*' and 'b'
            for (int j = 0; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("b");
                }
            }

            // Move to next line
            System.out.println();
        }
    }
}
