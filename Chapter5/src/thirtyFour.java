import java.util.Scanner;

public class thirtyFour {
    public static boolean checkPrime(int n){
        boolean ans = true;
        int i=2;
        while(i<n){
            if(n%i==0){
                ans = false;
                break;
            }
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
//        Create a program to check whether a given number is prime.
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = enter.nextInt();

        boolean ans = checkPrime(n);
        if(ans){
            System.out.println(n + " is a Prime Number!");
        } else {
            System.out.println(n + " is not a Prime Number!");
        }
    }
}
