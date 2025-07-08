import java.util.Locale;
import java.util.Scanner;

public class seventyOne {
    public static void main(String[] args) {
//        Concatenate and Convert: Take two strings, concatenate them,
//        and convert the result to uppercase.
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter the first name : ");
        String s1 = enter.nextLine();

        System.out.println("Enter the last name : ");
        String s2 = enter.nextLine();

        String s3 = s1+" " + s2;
        System.out.println("Name is : " + s3.toUpperCase());
    }
}
