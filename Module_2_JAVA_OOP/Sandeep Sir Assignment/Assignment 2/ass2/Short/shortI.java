/*i.Experiment with converting a short value into other primitive types or vice versa and observe the results.
Program:
*/
public class ShortExample {
    public static void main(String[] args) {
        short number = 100;
        int intValue = number;
        byte byteValue = (byte) number;  // Casting needed
        long longValue = number;
        float floatValue = number;
        double doubleValue = number;

        System.out.println("Short value as int: " + intValue);
        System.out.println("Short value as byte (with casting): " + byteValue);
        System.out.println("Short value as long: " + longValue);
        System.out.println("Short value as float: " + floatValue);
        System.out.println("Short value as double: " + doubleValue);
    }
}
