import java.util.Scanner;

public class thirtySeven {
    public static int noOfDigits(int n){
        int count = 0;
        while(n!=0){
            n = n/10;
            count++;
        }
        return count;
    }
    public static int armstrongNumber(int n){
        int digits = noOfDigits(n);
        int armNum = 0;
        while(n!=0){
            int rem = n%10;
            n = n/10;
            armNum = armNum + (int)Math.pow(rem,digits);
        }
        return armNum;
    }
    public static void main(String[] args) {
//        Create a program to check if a number is an Armstrong number.
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = enter.nextInt();
        int ans = armstrongNumber(n);
        if(ans==n){
            System.out.println(n + " is Armstrong Number.");
        } else {
            System.out.println(n + " is not a Armstrong Number.");
        }
    }
}
