import java.util.Scanner;

public class thirteen {
//    Create a program to calculate Compound interest.
//            Compound Interest = P(1 + R/100)t

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter principal amount : ");
        int amount = enter.nextInt();
        System.out.println("Enter time : ");
        int time = enter.nextInt();
        System.out.println("Enter rate : ");
        float rate = enter.nextFloat();
        System.out.println("Compound Interest is : " + amount*(1+rate/100)*time);
    }
}
