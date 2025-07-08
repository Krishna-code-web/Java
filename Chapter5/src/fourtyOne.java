public class fourtyOne {
    public static void main(String[] args) {
//        Create a program to find number of occurrences of an element in an
//        array.
        int[] array = {1,2,3,4,2,4,4,6,7};
        int element = 2;

        int occurrences = 0;
        int i=0;
        while(i<array.length){
            if(array[i]==element){
                occurrences++;
            }
            i++;
        }
        System.out.println("Number of occurrences of " + element + " is : " + occurrences);
    }
}
