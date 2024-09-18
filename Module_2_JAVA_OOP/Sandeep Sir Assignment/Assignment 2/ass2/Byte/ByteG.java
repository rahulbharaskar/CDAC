/*g. Declare a method-local variable number of type byte with some value and convert it to the corresponding wrapper class using Byte.valueOf(). (Hint: Use Byte.valueOf(byte)).*/
public class ByteG{
    public static void main(String[] args) {
        byte number = 42;
        Byte byteObject = Byte.valueOf(number);
        System.out.println(byteObject);
    }
}
