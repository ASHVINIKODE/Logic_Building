import java.util.Scanner;

public class TriangleBottom {

    static void star(int n){

        if(n == 0){
            return;
        }

        System.out.print("*");
        star(n - 1);
    }

    static void triangle(int n){

        if(n == 0){
            return;
        }

        triangle(n - 1);

        star(n);
        System.out.println();
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        triangle(n);
    }
}