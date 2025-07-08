import java.util.Scanner;

public class eighth {
    //    Create a program that takes two numbers and shows result of all
    //    arithmetic operators (+,-,*,/,%).
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = enter.nextInt();
        System.out.println("Enter b : ");
        int b = enter.nextInt();
        System.out.println("Addition : " + (a+b));
        System.out.println("Subtraction : " + (a-b));
        System.out.println("Multiplication : " + (a*b));
        System.out.println("Division : " + (a/b));
        System.out.println("Modulus : " + (a%b));
    }
}
