/*e. Declare a method-local variable strNumber of type String with some value and convert it to a long value using the parseLong method. (Hint: Use Long.parseLong(String)).*/
public class StringToLong {
    public static void main(String[] args) {
        String strNumber = "54321"; // Method-local variable
        long number = Long.parseLong(strNumber); // Conversion to long
        System.out.println("Converted long value: " + number);
    }
}
