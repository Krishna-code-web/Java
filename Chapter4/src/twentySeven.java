import java.util.Scanner;

public class twentySeven {
//    Write a program to check if a given number is even or odd using
//    bitwise operators.
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = enter.nextInt();

        if((n&1) == 1){
            System.out.println("Odd Number");
        } else {
            System.out.println("Even Number");
        }
    }
}
