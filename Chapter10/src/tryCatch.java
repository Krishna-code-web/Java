public class tryCatch {
    public static void main(String[] args) {
        try{
            int num = 60/0;
            System.out.println(num);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Exception : " + e.getStackTrace());
        } catch (NumberFormatException | ArithmeticException e){
            System.out.println("Multiple Exceptions");
        } catch(Exception e){
            System.out.println("Last Exception");
        }
    }
}
