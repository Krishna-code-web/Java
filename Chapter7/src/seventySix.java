public class seventySix {
    final String name;
    final int age;

    seventySix(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return this.name + " is of " + this.age;
    }

    public static void main(String[] args) {
//        Create an object with final fields and a constructor to initialize
//        them.
        seventySix obj = new seventySix("Krishna", 20);
        System.out.println(obj);

    }
}
