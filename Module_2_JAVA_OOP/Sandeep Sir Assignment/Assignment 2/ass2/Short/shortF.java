/*f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a short value. (Hint: parseShort method will throw a NumberFormatException).*/
public class ShortF {
    public static void main(String[] args) {
        String strNumber = "Ab12cd3";
        short number = Short.parseShort(strNumber);
        System.out.println("Short value from string: " + number);
    }
}