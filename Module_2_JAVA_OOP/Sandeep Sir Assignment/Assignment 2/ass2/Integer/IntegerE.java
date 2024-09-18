/*e. Declare a method-local variable strNumber of type String with some value and convert it to an int value using the parseInt method. (Hint: Use Integer.parseInt(String)).*/
public class IntegerE {
    public static void main(String[] args) {
        String strNumber = "123";
        int number = Integer.parseInt(strNumber);
        System.out.println("Int value from string: " + number);
    }
}
