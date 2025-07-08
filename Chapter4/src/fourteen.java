import java.util.Scanner;

public class fourteen {
//    Create a program to convert Fahrenheit to Celsius
// °C = (°F - 32) × 5/9
public static void main(String[] args) {
    Scanner enter = new Scanner(System.in);
    System.out.println("Enter Fahrenheit Temperature : ");
    float temp = enter.nextFloat();
    float celsius = (temp - 32) * (5.0f/9);

    System.out.println("Celsius Temperature is : " + celsius);
}
}
