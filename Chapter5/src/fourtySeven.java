public class fourtySeven {
    public static void main(String[] args) {
//        Create a program to merge two sorted arrays.
        int[] array1 = {1,3,5,8,10};
        int[] array2 = {2,4,6,7,9};

        int[] mergedArray = new int[array1.length + array2.length];
        int i=0;
        int j=0;
        int k=0;

        while(i<array1.length && j<array2.length){
            if(array1[i]<array2[j]){
                mergedArray[k] = array1[i];
                i++;
            } else if(array1[i]>array2[j]) {
                mergedArray[k] = array2[j];
                j++;
            } else{
                mergedArray[k] = array1[i];
                i++;
                j++;
            }
            k++;
        }

        while(i<array1.length){
            mergedArray[k] = array1[i];
            i++;
            k++;
        }

        while(j<array2.length){
            mergedArray[k] = array2[j];
            j++;
            k++;
        }

        for(int l=0;l<mergedArray.length;l++){
            System.out.print(mergedArray[l] + " ");
        }
    }
}
