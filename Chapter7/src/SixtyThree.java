public class SixtyThree {
    public static void main(String[] args) {
//        Create a program using for-each to find the maximum value in an integer array.
        int[] array = {1,9,8,7,66,5};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int number:array){
            if(number>max){
                max = number;
            }
            if(number<min){
                min = number;
            }
        }
        System.out.println("Maximum is : " + max);
        System.out.println("Minimum is : " + min);
    }
}
