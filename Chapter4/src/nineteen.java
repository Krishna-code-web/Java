import java.util.Scanner;

public class nineteen {
//    Create a program that calculates grades based on marks
//    A -> above 90%
//    C -> above 60%
//    B -> above 75%
//    D -> above 30%
//    F -> below 30%
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter your Marks : ");
        int marks = enter.nextInt();
        if (marks>=90){
            System.out.println("A");
        } else if(marks>=75){
            System.out.println("B");
        } else if(marks>=60){
            System.out.println("C");
        } else if(marks>=30){
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
