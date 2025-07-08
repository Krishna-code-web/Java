import java.util.Scanner;

public class twentySix {
    //    Create a program that shows use of left shift operator.
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = enter.nextInt();
        System.out.println("Right Shift Operator is : " + (n>>1));
    }
}
