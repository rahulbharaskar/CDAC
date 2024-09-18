/*g. Declare a method-local variable number of type int with some value and convert it to the corresponding wrapper class using Integer.valueOf(). (Hint: Use Integer.valueOf(int)).*/
public class IntegerG{
    public static void main(String[] args) {
        int number = 100;
        Integer wrapperObject = Integer.valueOf(number);
        System.out.println("Integer object: " + wrapperObject);
    }
}
