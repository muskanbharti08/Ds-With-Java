import java.util.Scanner;

public class OverLoading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String a = sc.nextLine();
        wave(a);
        }
    static void wave(){
        System.out.println("Welcome");
    }
    static void wave(String c){
        System.out.println("Welcome "+ c);

    }
}