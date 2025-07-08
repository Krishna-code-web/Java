public class Practice1 {
    String color;
    float price;

    Practice1(){
        this.color = "Red";
        this.price = 10000;
    }

    Practice1(String color, float price){
        this.color = color;
        this.price = price;
    }

    public static void main(String[] args) {
        Practice1 obj1 = new Practice1();
        System.out.println("Color is : " + obj1.color);
        System.out.println("Price is : " + obj1.price);

        Practice1 obj2 = new Practice1("Blue", 20000);
        System.out.println("Color is : " + obj2.color);
        System.out.println("Price is : " + obj2.price);

    }
}
