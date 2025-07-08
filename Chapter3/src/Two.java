import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
//        Create a program to add two numbers.
        System.out.println("Enter first Number : ");
        int a = enter.nextInt();
        System.out.println("Enter second Number : ");
        int b = enter.nextInt();
        System.out.println("Sum of two Numbers is : " + (a+b));
    }
}
