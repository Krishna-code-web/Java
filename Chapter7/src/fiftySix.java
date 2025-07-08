import java.util.Scanner;

public class fiftySix {
    public static void main(String[] args) {
//        Create a program to Based on a student's score, categorize as
//        "High", "Moderate", or "Low" using the ternary operator (e.g.,
//         High for scores > 80, Moderate for 50-80, Low for < 50).
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter your Marks : ");
        int number = enter.nextInt();

        String category = (number>80)? "High": (number>50)? "Moderate": "Low";
        System.out.println("Your grade is : " + category);
    }
}
