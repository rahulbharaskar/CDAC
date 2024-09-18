/*k. Declare an integer variable with the value 7. Convert it to binary, octal, and hexadecimal strings using methods from the Integer class. (Hint: Use Integer.toBinaryString(int), Integer.toOctalString(int), and Integer.toHexString(int)).*/
public class IntegerK{
    public static void main(String[] args) {
        int number = 7;
        String binary = Integer.toBinaryString(number);
        String octal = Integer.toOctalString(number);
        String hex = Integer.toHexString(number);
        System.out.println("Binary representation of 7: " + binary);
        System.out.println("Octal representation of 7: " + octal);
        System.out.println("Hexadecimal representation of 7: " + hex);
    }
}
