import java.util.Scanner;

public class PalindromeRec {

    static int rev = 0;

    static int reverse(int n){

        if(n == 0){
            return rev;
        }

        int d = n % 10;
        rev = rev * 10 + d;

        return reverse(n / 10);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n;

        int r = reverse(n);

        if(temp == r){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}