import java.util.Scanner;
public class One {
//    Create a program to input name of the person and
//    respond with ”Welcome NAME to KG Coding”
public static void main(String[] args) {
    Scanner enter = new Scanner(System.in);
    System.out.println("Enter your Name : ");
    String name = enter.nextLine();
    System.out.println("Welcome " + name + " to KG Coding.");
}
}
