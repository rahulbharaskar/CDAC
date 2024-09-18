/*h. Declare a method-local variable strNumber of type String with some double value and convert it to the corresponding wrapper class using Double.valueOf(). (Hint: Use Double.valueOf(String)).*/

public class doubleH {
    public static void main(String[] args) {
        String strNumber = "123.456";
        Double WDS = Double.valueOf(strNumber);
        System.out.println("Double wrapper class object: " + WDS);
    }
}
