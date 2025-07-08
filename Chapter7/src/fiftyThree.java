import java.util.Scanner;

public class fiftyThree {
    public static void main(String[] args) {
//        Create a program to find the minimum of two numbers.?
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int a = enter.nextInt();
        System.out.println("Enter a Number : ");
        int b = enter.nextInt();

        int minimum = (a<b)? a:b;
        System.out.println("Minimum is : " + minimum);
    }
}
