import java.util.Scanner;

public class RemoveSpaceRec {

    static String remove(String s){

        if(s.length() == 0){
            return "";
        }

        char c = s.charAt(0);

        if(c == ' '){
            return remove(s.substring(1));
        }

        return c + remove(s.substring(1));
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(remove(s));
    }
}