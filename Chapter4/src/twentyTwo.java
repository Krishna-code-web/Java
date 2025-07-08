import java.util.Scanner;

public class twentyTwo {
    //    Create a program that shows bitwise OR of two numbers.
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter first Number : ");
        int a = enter.nextInt();
        System.out.println("Enter second Number : ");
        int b = enter.nextInt();
        System.out.println("Bitwise OR is : " + (a|b));
    }
}
