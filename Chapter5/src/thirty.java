import java.util.Scanner;

public class thirty {
    public static void main(String[] args) {
//        Write a function that calculates the factorial of a given number.
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = enter.nextInt();

        int fact = 1;
        int i=2;
        while(i<=n){
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of " + n + " is : " + fact);
    }
}
