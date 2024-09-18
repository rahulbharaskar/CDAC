/*d. Declare a method-local variable number of type short with some value and convert it to a String using the toString method. (Hint: Use Short.toString(short)).*/
public class ShortD{
    public static void main(String[] args) {
        short number = 32000;
        String strNumber = Short.toString(number);
        System.out.println("String representation of short value: " + strNumber);
    }
}
