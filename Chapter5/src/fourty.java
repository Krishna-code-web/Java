public class fourty {
    public static void main(String[] args) {
//        Create a program to find the sum and average of all elements in an
//        array.
        int[] array = {1,2,3,4,5};
        int sum = 0;
        int i=0;
        while(i<array.length){
            sum = sum + array[i];
            i++;
        }
        System.out.println("Sum of all elements is : " + sum);
        System.out.println("Average is : " + (sum/array.length));
    }
}
