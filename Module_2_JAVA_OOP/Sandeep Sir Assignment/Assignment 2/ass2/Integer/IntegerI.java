/*i. Declare two integer variables with values 10 and 20, and add them using a method from the Integer class. (Hint: Use Integer.sum(int, int)).*/
public class IntegerI{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = Integer.sum(a, b);
        System.out.println("Sum of 10 and 20: " + sum);
    }
}
