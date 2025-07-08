import java.util.Scanner;

public class thirtyNine {
    public static void pattern1(int n){
//        *
//        * *
//        * * *
//        * * * *
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
    public static void pattern2(int n){
//        * * * *
//        * * *
//        * *
//        *
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n-i+1){
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
    public static void pattern3(int n){
//              *
//            * *
//          * * *
//        * * * *
        int i=1;
        while(i<=n){
            int k=1;
            while(k<=n-i){
                System.out.print("  ");
                k++;
            }
            int j=1;
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        Create a program that print patterns:
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = enter.nextInt();
        pattern1(n);
        System.out.println();
        pattern2(n);
        System.out.println();
        pattern3(n);
        System.out.println();
    }
}
