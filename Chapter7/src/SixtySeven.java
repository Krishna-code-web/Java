import java.util.Scanner;

public class SixtySeven {
    public static void main(String[] args) {
//        Create a program using continue to print only even numbers using continue for
//        odd numbers.
        Scanner enter = new Scanner(System.in);
        int input;
        while(true) {
            System.out.println("\nEnter the Value : ");
            input = enter.nextInt();
            if (input%2!=0) {
                continue;
            }
            System.out.print(input + " ");
        }
    }
}
