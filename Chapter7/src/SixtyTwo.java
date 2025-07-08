import java.util.Scanner;
public class SixtyTwo {
    public static boolean checkPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
//        Create a program using for to display if a number is prime or not.
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
