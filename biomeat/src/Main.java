import java.util.Scanner;
public class Main {
    public static String NOT_YET = "Искусственное мясо еще не готово.";
    public static String DONE = "Искусственное мясо готово.";
    public static String HORRIBLY_DONE = "Искусственное мясо превратилось в мясного монстра!";
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int hours = console.nextInt();
        int minutes = console.nextInt();
        int summa = hours*60;
        if (summa + minutes == 30) {
            System.out.println(DONE);
        } else if (summa + minutes < 30){
            System.out.println(NOT_YET);
        } else if (summa +minutes > 30) {
            System.out.println(HORRIBLY_DONE);

        }


    }
}