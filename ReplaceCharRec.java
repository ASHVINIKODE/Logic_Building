import java.util.Scanner;

public class ReplaceCharRec {

    static String replace(String s){

        if(s.length() == 0){
            return "";
        }

        char c = s.charAt(0);

        if(c == 'a'){
            c = 'x';
        }

        return c + replace(s.substring(1));
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(replace(s));
    }
}