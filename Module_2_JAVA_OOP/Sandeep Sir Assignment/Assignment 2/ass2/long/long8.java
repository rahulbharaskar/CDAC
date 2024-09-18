/*i. Declare two long variables with values 1123 and 9845, and add them using a method from the Long class. (Hint: Use Long.sum(long, long)).*/
public class LongSum {
    public static void main(String[] args) {
        long num1 = 1123L;
        long num2 = 9845L;
        long sum = Long.sum(num1, num2); // Sum using Long class method
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
