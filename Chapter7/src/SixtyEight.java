import java.util.Scanner;

public class SixtyEight {
    public static void fibonacci(int n,int i,int j,int k){
        if(i>n){
            return;
        }
        System.out.print(i + " ");
        i = j;
        j = k;
        k = i+j;
        fibonacci(n,i,j,k);
    }
    public static void main(String[] args) {
//        Create a program using recursion to display the Fibonacci series upto a certain
//        number.
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = enter.nextInt();
        fibonacci(n,0,1,1);
    }
}
