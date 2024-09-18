/*g. Declare a method-local variable number of type short with some value and convert it to the corresponding wrapper class using Short.valueOf(). (Hint: Use Short.valueOf(short)).*/
public class ShortG{
    public static void main(String[] args) {
        short number = 10000;
        Short wrapper = Short.valueOf(number);
        System.out.println("Short object: " + wrapper);
    }
}

