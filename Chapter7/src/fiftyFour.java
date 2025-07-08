import java.util.Scanner;

public class fiftyFour {
    public static void main(String[] args) {
//        Create a program to find if the given number is even or odd.
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int number = enter.nextInt();

        String numtype = (number%2==0)? "Even": "Odd";
        System.out.println("Number is " + numtype);

    }
}
