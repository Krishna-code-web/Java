public class PracticeStrings {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        String name = "Java";
        System.out.printf("%s", name);
        System.out.println();
        System.out.printf("%15s", name);
        System.out.println();
        System.out.printf("%-15s", name);
        System.out.printf("%-15S", name);

        // String Builder
        StringBuilder sentence = new StringBuilder("This is a Sentence.");
        sentence.append("Added word.");
        System.out.println(sentence);

        // String Buffer
        StringBuffer sentence1 = new StringBuffer("This is a new Sentence.");
        sentence1.append("added words.");
        System.out.println(sentence1);

        final int num = 10;
        System.out.println(num);
//        num = 55;
    }
}
