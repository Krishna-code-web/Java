import java.util.Scanner;

public class sixteen {
    public static void main(String[] args) {
//        .Create a program that determines if a number is odd or even.
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = enter.nextInt();
        if(n%2==0){
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
