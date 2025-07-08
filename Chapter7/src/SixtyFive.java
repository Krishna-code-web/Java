import java.util.Scanner;

public class SixtyFive {
    public static void main(String[] args) {
//        Create a program using break to read inputs from the user in a loop and break
//                the loop if a specific keyword (like "exit") is entered.
        Scanner enter = new Scanner(System.in);
        String input;
        while(true){
            System.out.println("Enter the Value : ");
            input = enter.nextLine();
            if(input.equals("exit")){
                break;
            }
        }
        System.out.println("Program Ends!");
    }
}
