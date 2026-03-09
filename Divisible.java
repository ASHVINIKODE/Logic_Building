
public class Divisible {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= 500; i++) {
            if (i % 7 == 0 && i % 5 != 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
