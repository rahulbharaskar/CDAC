/*d. Declare a method-local variable number of type float with some value and convert it to a String using the toString method. (Hint: Use Float.toString(float)).*/
public class floatD {
    public static void main(String[] args) {
        float number = 123.45f;
        String str = Float.toString(number);
        System.out.println("Float to String: " + str);
    }
}
