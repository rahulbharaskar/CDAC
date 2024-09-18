/*j. Declare two integer variables with values 10 and 20, and find the minimum and maximum values using the Integer class. (Hint: Use Integer.min(int, int) and Integer.max(int, int)).*/
public class IntegerJ{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int minValue = Integer.min(a, b);
        int maxValue = Integer.max(a, b);
        System.out.println("Minimum value between 10 and 20: " + minValue);
        System.out.println("Maximum value between 10 and 20: " + maxValue);
    }
}
