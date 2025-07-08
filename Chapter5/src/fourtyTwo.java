public class fourtyTwo {
    public static void main(String[] args) {
//        Create a program to find the maximum and minimum element in an
//        array.
        int[] array = {1,9,8,7,66,5};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int i=0;
        while(i<array.length){
            if(array[i]>max){
                max = array[i];
            }
            if(array[i]<min){
                min = array[i];
            }
            i++;
        }
        System.out.println("Maximum is : " + max);
        System.out.println("Minimum is : " + min);
    }
}
