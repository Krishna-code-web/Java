import java.util.Scanner;

public class twelveth {
//    Create a program to calculate simple interest.
//            Simple Interest = (P x T x R)/100
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter principal amount : ");
        int amount = enter.nextInt();
        System.out.println("Enter time : ");
        int time = enter.nextInt();
        System.out.println("Enter rate : ");
        float rate = enter.nextFloat();
        System.out.println("Simple Interest is : " + (amount*time*rate)/100);
    }
}
