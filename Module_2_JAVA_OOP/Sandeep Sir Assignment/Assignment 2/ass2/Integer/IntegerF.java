/*f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to an int value. (Hint: parseInt method will throw a NumberFormatException).*/
public class ShortF {
    public static void main(String[] args) {
        String strNumber = "Ab12cd3";
        int number = Integer.parseInt(strNumber);
        System.out.println("int value from string: " + number);
    }
}