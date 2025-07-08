public class SixtyFour {
    public static void main(String[] args) {
//        Create a program using for-each to find the occurrences of a specific element in an
//        array.
        int[] array = {1,2,3,4,2,4,4,6,7};
        int element = 4;

        int occurrences = 0;
        for(int number:array){
            if(element==number){
                occurrences++;
            }
        }
        System.out.println("Number of occurrences of " + element + " is : " + occurrences);
    }
}
