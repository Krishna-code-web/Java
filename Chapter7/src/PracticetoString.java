import java.util.Scanner;

public class PracticetoString {

    @Override
    public String toString(){
        return "Krishna is a amazing person!";
    }
    public static void main(String[] args) {
        String name = "Krishna";
        String name1 = new String("Gupta");
        Scanner enter = new Scanner(System.in);
        String input = enter.nextLine();
        System.out.println("Your name is : " + input);
        PracticetoString obj = new PracticetoString();
        System.out.println(obj);

    }
}
