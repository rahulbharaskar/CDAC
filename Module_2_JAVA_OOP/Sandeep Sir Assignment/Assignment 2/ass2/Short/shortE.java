/*e. Declare a method-local variable strNumber of type String with some value and convert it to a short value using the parseShort method. (Hint: Use Short.parseShort(String)).*/
public class ShortE {
    public static void main(String[] args) {
        String strNumber = "12345";
        short number = Short.parseShort(strNumber);
        System.out.println("Short value from string: " + number);
    }
}

