//Write a Java program to print a Palindrome Number Pyramid.
public class codetest5 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
            int num = 1;
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(num);
                if (k < i) num++;
                else num--;
            }
            System.out.println();
        }
    }
}