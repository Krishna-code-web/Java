public class fourtyEight {
    public static boolean checker(int[][] array, int element){
        int i=0;
        while(i<array.length){
            int j=0;
            while(j<array[i].length){
                if(array[i][j]==element){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
//        Create a program to search an element in a 2-D array.
        int[][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int element = 0;
        boolean ans = checker(array,element);
        if(ans){
            System.out.println(element + " is present in array.");
        } else {
            System.out.println(element + " is not present in array.");
        }
    }
}
