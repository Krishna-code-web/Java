import java.util.Scanner;

public class SixtyOne {
    public static void main(String[] args) {
//        Create a program using for loop multiplication table for a number.
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = enter.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(n + " * " + i + " = " + (n*i));
        }
    }
}
