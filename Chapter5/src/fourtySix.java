public class fourtySix {
    public static boolean isPalindrome(int[] array){
        int n = array.length;
        int i=0;
        int j=n-i-1;
        while(i<j){
            if(array[i]!=array[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
//        Create a program to check is the array is palindrome or not.
        int[] array = {1,2,3,3,2,1};

        boolean ans = isPalindrome(array);
        if(ans){
            System.out.println("Palindromic Array!");
        } else {
            System.out.println("Not a Palindromic Array!");
        }
    }
}
