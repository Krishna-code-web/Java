import java.util.Scanner;

public class SixtySix {
    public static void main(String[] args) {
//        Create a program using continue to sum all positive numbers entered by the
//                user; skip any negative numbers.
        Scanner enter = new Scanner(System.in);
        int input = 0;
        int sum = 0;
        while(input<=100){
            System.out.println("Enter the Value : ");
            input = enter.nextInt();
            if(input<=0){
                continue;
            }
            sum += input;
        }
        System.out.println("Sum is : " + sum);
    }
}
