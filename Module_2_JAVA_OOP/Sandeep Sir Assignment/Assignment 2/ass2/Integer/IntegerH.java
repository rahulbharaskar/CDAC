/*h. Declare a method-local variable strNumber of type String with some integer value and convert it to the corresponding wrapper class using Integer.valueOf(). (Hint: Use Integer.valueOf(String)).*/
public class IntegerH {
    public static void main(String[] args) {
        String strNumber = "456";
        int wrapperObject = Integer.valueOf(strNumber);
        System.out.println("Integer object from string: " + wrapperObject);
    }
}
