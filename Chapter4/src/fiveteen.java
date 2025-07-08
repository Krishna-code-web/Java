import java.util.Scanner;

public class fiveteen {
    public static void main(String[] args) {
//        Create a program that determines if a number is positive, negative,
//        or zero.
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = enter.nextInt();
        if(n==0){
            System.out.println("Zero");
        } else if(n>0){
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
}
