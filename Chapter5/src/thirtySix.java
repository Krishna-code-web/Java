import java.util.Scanner;

public class thirtySix {
    public static void fibonacciSeries(int n){
        int a = 0;
        int b = 1;
        int c;
        while(a<=n){
            System.out.print(a + " ");
            c = a+b;
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
//        Create a program to print the Fibonacci series up to a certain number.
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = enter.nextInt();
        fibonacciSeries(n);
    }
}
