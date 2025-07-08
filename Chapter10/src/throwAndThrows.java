public class throwAndThrows {
    public static void printName(String name) throws IllegalArgumentException{
        if(name.contains("-")){
            throw new IllegalArgumentException("Name contains -");
        }
        System.out.println(name);
    }
    public static void main(String[] args) {
        String name = "kris-hna";
        try{
            printName(name);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
