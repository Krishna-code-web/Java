import java.util.Scanner;

public class fiftyFive {
    public static void main(String[] args) {
//        Create a program to calculate the absolute value of a given
//        integer.
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int number = enter.nextInt();

        int num = (number>=0)? number: -number;
        System.out.println("Number is " + num);
    }
}
