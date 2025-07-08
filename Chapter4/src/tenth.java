import java.util.Scanner;

public class tenth {
//    .Create a program to calculate Perimeter of a rectangle.
//    Perimeter of rectangle ABCD = A+B+C+D
public static void main(String[] args) {
    Scanner enter = new Scanner(System.in);
    System.out.println("Enter breadth : ");
    int a = enter.nextInt();
    System.out.println("Enter height : ");
    int b = enter.nextInt();
    System.out.println("Perimeter is : " + 2*(a+b));
}
}
