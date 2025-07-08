public class fourtyFive {
    public static void reverse(int[] array){
        int n = array.length;
        int i=0;
        int j=n-i-1;
        while(i<j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
//        return array;
    }
    public static void main(String[] args) {
//        Create a program to reverse an array.
        int[] array = {1,2,3,4,5,6};

        reverse(array); // In array, reference is passed not the copy of that array.
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }
}
