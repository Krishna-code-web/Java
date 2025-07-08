public class seventy {
    String name;
    int age;
    public seventy(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return "Name is : " + this.name + " and age is : " + this.age;
    }
    public static void main(String[] args) {
//        Define a Student class with fields like name and age, and use
//        toString to print student details.
        seventy student1 = new seventy("Krishna", 20);
        System.out.println(student1);
    }
}
