import java.util.Scanner;

public class Sixty {
    public static void main(String[] args) {
//        Create a program using do-while to implement a number guessing game.
        Scanner enter = new Scanner(System.in);
        int number = 100;
        int guessedNumber;
        int attempts = 0;
        do{
            System.out.println("Enter the Number : ");
            guessedNumber = enter.nextInt();
            if(number!=guessedNumber){
                System.out.println("Wrong! Please try Again.");
            }
            attempts++;
        }while(number!=guessedNumber);
        System.out.println("You Guessed the Number in " + attempts + " attempts.");
    }
}
