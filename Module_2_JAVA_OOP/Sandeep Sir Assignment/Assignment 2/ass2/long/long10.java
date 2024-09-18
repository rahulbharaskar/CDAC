/*k. Declare a long variable with the value 7. Convert it to binary, octal, and hexadecimal strings using methods from the Long class. (Hint: Use Long.toBinaryString(long), Long.toOctalString(long), and Long.toHexString(long)).*/

public class long10 {
    public static void main(String[] args) {
        long num = 7;
		
        String binaryString = Long.toBinaryString(num);
        String octalString = Long.toOctalString(num);
        String hexString = Long.toHexString(num);

        System.out.println("Binary representation: " + binaryString);
        System.out.println("Octal representation: " + octalString);
        System.out.println("Hexadecimal representation: " + hexString);
    }
}
