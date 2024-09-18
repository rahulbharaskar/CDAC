/*g. Declare a method-local variable number of type long with some value and convert it to the corresponding wrapper class using Long.valueOf(). (Hint: Use Long.valueOf(long)).*/
public class LongToWrapper {
    public static void main(String[] args) {
        long number = 98765L; // Method-local variable
        Long longWrapper = Long.valueOf(number); // Conversion to Long wrapper class
        System.out.println("Long wrapper object: " + longWrapper);
    }
}
