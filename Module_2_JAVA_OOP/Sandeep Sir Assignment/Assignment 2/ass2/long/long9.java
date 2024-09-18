/*j. Declare two long variables with values 1122 and 5566, and find the minimum and maximum values using the Long class. (Hint: Use Long.min(long, long) and Long.max(long, long)).*/
public class long9{
    public static void main(String[] args) {
        long num1 = 1122;
        long num2 = 5566;

        long min = Long.min(num1, num2);
        long max = Long.max(num1, num2);

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
