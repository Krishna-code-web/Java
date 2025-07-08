import java.util.Scanner;

public class thirtyEight {
    public static int reversedNumber(int n){
        int rev = 0;
        while(n!=0){
            int rem = n%10;
            n = n/10;
            rev = rev*10 + rem;
        }
        return rev;
    }
    public static void main(String[] args) {
//        Create a program to verify if a number is a palindrome.
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = enter.nextInt();
        int ans = reversedNumber(n);
        if(ans==n){
            System.out.println(n + " is Palindrome Number!");
        } else {
            System.out.println(n + " is not a Palindrome Number!");
        }
    }
}
