public class fiftyTwo {
    String courseName;
    int enrolledStudents;
    static int maxCapacity;

    fiftyTwo(String courseName, int enrolledStudents){
        this.courseName =  courseName;
        this.enrolledStudents = enrolledStudents;
    }
    public void enrolledStudent(String studentName){
        if(this.enrolledStudents < maxCapacity){
            System.out.println(studentName + " is enrolled in the " + this.courseName + " course");
            this.enrolledStudents++;
        } else {
            System.out.println("There are no available seats.");
        }
    }

    public void unenrollStudent(String studentName){
        System.out.println(studentName + " is unenrolled from the " + this.courseName + " course");
        this.enrolledStudents--;
    }

    public static void setMaxCapacity(int capacity){
        maxCapacity = capacity;
    }
    public static void main(String[] args) {
//        Design a Course class.
// • Instance variables: courseName, enrolledStudents.
// • Static variable: maxCapacity, the maximum number of students for any
//        course.
// • Instance methods: enrollStudent(String studentName),
//                unenrollStudent(String studentName).
// • Static method: setMaxCapacity(int capacity), to set the maximum
//        capacity for courses.
        fiftyTwo course1 = new fiftyTwo("Python Champion", 4);
        fiftyTwo.setMaxCapacity(10);

        course1.enrolledStudent("Krishna");
        course1.enrolledStudent("Mansi");
        course1.enrolledStudent("Harsh");
        course1.enrolledStudent("Manish");
        course1.enrolledStudent("Rajendra");
        course1.enrolledStudent("Harshita");
        course1.enrolledStudent("Lakshit");
        course1.enrolledStudent("Isha");


    }
}
