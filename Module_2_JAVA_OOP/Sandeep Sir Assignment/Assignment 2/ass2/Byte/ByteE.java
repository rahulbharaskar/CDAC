/*e. Declare a method-local variable strNumber of type String with some value and convert it to a byte value using the parseByte method. (Hint: Use Byte.parseByte(String)).*/
public class ByteE{
    public static void main(String[] args) {
        byte number = 100;
        String strNumber = Byte.toString(number);
        System.out.println(strNumber);
    }
}
