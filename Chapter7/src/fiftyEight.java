import java.util.Scanner;

public class fiftyEight {
    public static void main(String[] args) {
//        Create a program to create a simple calculator that uses a
//        switch statement to perform basic arithmetic operations
//        like addition, subtraction, multiplication, and division.
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter first Operand : ");
        int a = enter.nextInt();
        System.out.println("Enter second Operand : ");
        int b = enter.nextInt();

        System.out.println("Enter the Operator : ");
        char op = enter.next().charAt(0);
        int ans = switch(op){
            case '+' -> (a+b);
            case '-' -> (a-b);
            case '*' -> (a*b);
            case '/' -> (a/b);
            default -> Integer.MIN_VALUE;
        };

        System.out.println("Answer is : " + ans);

    }
}
