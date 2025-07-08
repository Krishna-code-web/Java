public class Practice2 {
    int id;
    String message;
    Practice2(){
        this(5);
    }
    Practice2(int id){
        this(id, "hi");
    }
    Practice2(int id, String message){
        this.id = id;
        this.message = message;
    }

    {
        // Initialization Block
        System.out.println("Initialization Block");
    }

    static {
        System.out.println("Static Block");
    }

    public static void main(String[] args) {
        Practice2 obj1 = new Practice2();
        System.out.println("Id is : " + obj1.id + " and Message is : " + obj1.message);

        Practice2 obj2 = new Practice2(10, "Hello");
        System.out.println("Id is : " + obj2.id + " and Message is : " + obj2.message);

        if(true){
            System.out.println("Code Block");
        }
    }
}
