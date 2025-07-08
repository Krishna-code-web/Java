public class fourtyThree {
    public static void main(String[] args) {
//        Create a program to check if the given array is sorted.
        int[] array = {1,2,3,4,5,7,6};

        boolean ans = true;
        int i=0;
        while(i<array.length-1){
            if(array[i]>array[i+1]){
                ans = false;
                break;
            }
            i++;
        }
        if(ans){
            System.out.println("Array is Sorted!");
        } else {
            System.out.println("Array is not Sorted!");
        }
    }
}
