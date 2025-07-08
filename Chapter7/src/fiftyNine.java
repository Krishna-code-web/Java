import java.util.Scanner;

public class fiftyNine {
    public static void main(String[] args) {
//        Create a program using do-while to find password checker until a valid
//        password is entered.
        Scanner enter = new Scanner(System.in);
        String password1 = "kri@2005;";
        String password;
        do{
            System.out.println("Enter the Password : ");
            password = enter.nextLine();
            if(!password.equals(password1)){
                System.out.println("Wrong Password. Please Try Again!");
            }
        }while(!password1.equals(password));
        System.out.println("Welcome to Windows!");
    }
}
