import java.util.Scanner;

public class seventyTwo {
    public static void main(String[] args) {
//        Calculate the area and circumference of a circle for a given radius
//        using Math.PI
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter the radius of a Circle : ");
        int radius = enter.nextInt();

        double area = Math.PI * radius * radius;
        double circumference = 2*Math.PI*radius;
        System.out.println("Area is : " + Math.floor(area));
        System.out.println("Circumference is : " + Math.floor(circumference));
    }
}
