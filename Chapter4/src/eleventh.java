import java.util.Scanner;

public class eleventh {
//    .Create a program to calculate the Area of a Triangle.
//    Area of triangle = ½*B*H
public static void main(String[] args) {
    Scanner enter = new Scanner(System.in);
    System.out.println("Enter base : ");
    int a = enter.nextInt();
    System.out.println("Enter height : ");
    int b = enter.nextInt();
    System.out.println("Area is : " + 0.5*a*b);
}
}
