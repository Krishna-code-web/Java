public class fifty {
    public static int diagonalSum(int[][] array){
        int sum=0;
        int i=0;
        while(i<array.length){
            int j=0;
            while(j<array[i].length){
                if(i==j || (i+j)==array.length-1){
                    sum += array[i][j];
                }
                j++;
            }
            i++;
        }
        return sum;
    }
    public static void main(String[] args) {
//        Create a program to find the sum of two diagonal elements.
        int[][] array = {
                {1,2,3,4,5},
                {4,5,6,7,8},
                {7,8,9,10,11},
                {10,11,12,13,14},
                {13,14,15,16,17}
        };
        int sum = diagonalSum(array);
        System.out.println("Sum of Diagonal elements is : " + sum);
    }
}
