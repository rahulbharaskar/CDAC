/*h. Declare a method-local variable strNumber of type String with some short value and convert it to the corresponding wrapper class using Short.valueOf(). (Hint: Use Short.valueOf(String)).*/
public class ShortH{
    public static void main(String[] args) {
        String strNumber = "32767";
        Short shortval = Short.valueOf(strNumber);
        System.out.println("Short object from string: " + shortval);
    }
}
