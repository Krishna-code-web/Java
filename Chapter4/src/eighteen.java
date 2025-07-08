import java.util.Scanner;

public class eighteen {
//    Create a program that determines if a given year is a leap year
//    (considering conditions like divisible by 4 but not 100, unless also
//    divisible by 400).
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = enter.nextInt();
        if ((year%4==0 && year%100!=0) || year%400==0){
            System.out.println(year + " is a Leap Year!");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}
