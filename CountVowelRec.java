import java.util.Scanner;

public class CountVowelRec {

    static int count(String s){

        if(s.length() == 0){
            return 0;
        }

        char c = Character.toLowerCase(s.charAt(0));

        int add = 0;

        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            add = 1;
        }

        return add + count(s.substring(1));
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(count(s));
    }
}