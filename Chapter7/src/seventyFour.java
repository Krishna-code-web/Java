import java.util.Scanner;

public class seventyFour {
    public static void main(String[] args) {
//        Create a number guessing game where the program selects a
//        random number, and the user has to guess it.
        int randonNumber = (int)(Math.floor(Math.random()*10) + 1);
        System.out.println(randonNumber);
        Scanner enter = new Scanner(System.in);
        int guessed = -1;
        int attempts = 0;
        while(randonNumber!=guessed){
            System.out.println("Enter the number : ");
            guessed = enter.nextInt();
            if(guessed>randonNumber){
                System.out.println("Too High!");
            } else if(guessed<randonNumber) {
                System.out.println("Too Low!");
            }
            attempts++;
        }
        System.out.println("You guessed the number in " + attempts + " attempts.");
    }
}
