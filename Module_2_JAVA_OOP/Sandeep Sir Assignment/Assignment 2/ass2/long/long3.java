/*d. Declare a method-local variable number of type long with some value and convert it to a String using the toString method. (Hint: Use Long.toString(long)).*/

public class LongToString {
    public static void main(String[] args) {
        long number = 12345L; // Method-local variable
        String strNumber = Long.toString(number); // Conversion to String
        System.out.println("String representation of long: " + strNumber);
    }
}
