public class seventyFive {
    public static void main(String[] args) {
//        Take an array of words and concatenate them into a single string
//        using StringBuilder.
        String[] words = {"Krishna", "Kumar", "Gupta"};
        StringBuilder ans = new StringBuilder();
        for(String word:words){
            ans.append(word);
        }
        System.out.printf("Final String is : %s", ans);
    }
}
