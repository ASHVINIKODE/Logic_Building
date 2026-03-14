import java.util.Scanner;

public class ReverseStringRec {

    static String reverse(String s){

        if(s.length() == 0){
            return "";
        }

        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();

        System.out.println(reverse(s));
    }
}
