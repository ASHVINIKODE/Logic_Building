import java.util.Scanner;

public class TriangleTop {

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

        star(n);
        System.out.println();

        triangle(n - 1);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        triangle(n);
    }
}