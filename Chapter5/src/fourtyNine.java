public class fourtyNine {
    public static int calculateSum(int[][] array){
        int sum = 0;
        int i=0;

        while(i<array.length){
            int j=0;
            while(j<array[i].length){
                sum += array[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
//        Create a program to do sum and average of all elements in a 2-D array.
        int[][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int sum = calculateSum(array);
        System.out.println("Sum of all elements is : " + sum);
        System.out.println("Average is : " + (sum/ (array.length * array[0].length)));
    }
}
