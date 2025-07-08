import java.util.Scanner;

public class thirtyFive {
    public static void main(String[] args) {
//        Create a program to reverse the digits of a number.
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = enter.nextInt();

        int rev = 0;
        while(n!=0){
            int rem = n%10;
            n = n/10;
            rev = rev*10 + rem;
        }
        System.out.println("Reversed Number is : " + rev);
    }
}
