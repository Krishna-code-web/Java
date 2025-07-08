import java.util.Scanner;

public class Seventh {
//    Create a program to swap two numbers.
public static void main(String[] args) {
    Scanner enter = new Scanner(System.in);
    System.out.println("Enter a : ");
    int a = enter.nextInt();
    System.out.println("Enter b : ");
    int b = enter.nextInt();
    System.out.println("Before Swapping : a = " + a + " & b = " + b);
    int c = a;
    a = b;
    b = c;
    System.out.println("After Swapping : a = " + a + " & b = " + b);
}
}
