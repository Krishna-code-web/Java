import java.util.Scanner;

public class twentyFive {
    //    Create a program that shows use of left shift operator.
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = enter.nextInt();
        System.out.println("Left Shift Operator is : " + (n<<1));
    }
}