import java.util.Scanner;

public class twentyFour {
//    Create a program that shows bitwise compliment of a number.
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = enter.nextInt();
        System.out.println("Bitwise Compliment is : " + (~n));
    }
}
