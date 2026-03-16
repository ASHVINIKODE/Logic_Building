import java.util.Scanner;

public class PalindromeStringRec {

    static boolean check(String s){

        if(s.length() <= 1){
            return true;
        }

        if(s.charAt(0) != s.charAt(s.length()-1)){
            return false;
        }

        return check(s.substring(1, s.length()-1));
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if(check(s)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}