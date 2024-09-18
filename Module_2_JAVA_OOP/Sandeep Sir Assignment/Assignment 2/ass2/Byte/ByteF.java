/*f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a byte value. (Hint: parseByte method will throw a NumberFormatException).*/
public class ByteF{
    public static void main(String[] args) {
        String strNumber = "Ab12cd3";
        byte number = Byte.parseByte(strNumber);
        System.out.println(number);
    }
}