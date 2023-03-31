import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();

        if (a == b & b == c & a == c){
            System.out.println(a+" "+b+" "+c);
        }
        else if (a == b){
            System.out.println(a+" "+b);
        }
        else if (b == c){
            System.out.println(c+" "+b);

        }
        else if (a == c){
            System.out.println(a+" "+c);
        }
    }
}