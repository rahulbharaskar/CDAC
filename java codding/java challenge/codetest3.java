//3. Write a Java program to print a pyramid pattern of alphabets, starting from 'A', using 
//spaces.
public class codetest3 {
    public static void main(String[] args) {
        int rows = 5;
        char ch = 'A';
        for (int i = 1; i <= rows; i++) {
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(ch++);
                if (ch > 'Z') ch = 'A';
            }
            System.out.println();
        }
    }
}
