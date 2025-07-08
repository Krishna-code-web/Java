public class fourtyFour {
    public static int[] createArray(int[] array, int element){
        int[] newArr = new int[array.length-1];
        int i=0;
        int j=0;
        while(i<array.length){
            if(array[i]!=element){
                newArr[j] = array[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
    public static void main(String[] args) {
//        Create a program to return a new array deleting a specific element.
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int element = 9;

        int[] newArr = createArray(array, element);
        int i=0;
        while(i<newArr.length){
            System.out.print(newArr[i] + " ");
            i++;
        }
    }
}
