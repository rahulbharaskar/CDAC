public class BooleanConversion {
    public static void main(String[] args) {
        String strStatus = "true";
        Boolean wrappedStatus = Boolean.valueOf(strStatus);  // parseBoolean also works here
        System.out.println(wrappedStatus);
    }
}
