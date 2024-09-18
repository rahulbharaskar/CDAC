/*d. Declare a method-local variable number of type int with some value and convert it to a String using the toString method. (Hint: Use Integer.toString(int)).*/
public class IntegerD {
    public static void main(String[] args) {
        int number = 100;
        String strNumber = Integer.toString(number);
        System.out.println("String representation of int value: " + strNumber);
    }
}
