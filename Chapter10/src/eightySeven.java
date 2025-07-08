import java.util.Scanner;

public class eightySeven {
    public static void main(String[] args) {
//        Arithmetic Exception Handling
//        Write a program that asks the user to enter two integers and
//        then divides the first by the second. The program should
//        handle any arithmetic exceptions that may occur (like
//                division by zero) and display an appropriate message.
//                Key Points:
// • Use Scanner to read user input.
// • Implement a try-catch block to handle ArithmeticException.
// • Display a user-friendly message if division by zero occurs.
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter first Number : ");
        int a = enter.nextInt();
        System.out.println("Enter second Number : ");
        int b = enter.nextInt();
        try{
            int num = a/b;
            System.out.println(num);
        } catch(ArithmeticException e){
            System.out.println(e.getMessage() + " occurs which is undefined.");
        }

    }
}
