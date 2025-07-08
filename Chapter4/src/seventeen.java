import java.util.Scanner;

public class seventeen {
    public static void main(String[] args) {
//        Create a program that determines the greatest of the three
//        numbers.
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter first Number : ");
        int a = enter.nextInt();
        System.out.println("Enter second Number : ");
        int b = enter.nextInt();
        System.out.println("Enter third Number : ");
        int c = enter.nextInt();
        if(a>b && a>c){
            System.out.println(a+ " is Greatest.");
        } else if(b>a && b>c) {
            System.out.println(b+ " is Greatest.");
        } else{
            System.out.println(c+ " is Greatest.");
        }
    }
}
