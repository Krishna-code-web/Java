import java.util.Scanner;

public class SixtyNine {
    public static boolean isPalindrome(String a,int i,int n){
        if(i>n){
            return true;
        }
        if(a.charAt(i)!=a.charAt(n)){
            return false;
        }
        return isPalindrome(a,i+1,n-1);

    }
    public static void main(String[] args) {
//        Create a program using recursion to check if a string is a palindrome using
//        recursion.
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String a = enter.nextLine();
        int n = a.length();
        boolean ans = isPalindrome(a,0,n-1);
        if(ans){
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not Palindrome!");
        }
    }
}
