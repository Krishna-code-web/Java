import java.util.Scanner;

public class thirtyOne {
    public static void main(String[] args) {
//        Create a program that computes the sum of the digits of an integer.
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = enter.nextInt();

        int sum = 0;
        while(n!=0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem;
        }
        System.out.println("Sum of Digits is : " + sum);
    }

}
