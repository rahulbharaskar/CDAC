/*Problem: Write a Java program to compute the factorial of a given number.*/

class Factorial{

    static int fact(int n) { 
        if (n <= 1) {
            return 1;
        } else {
            return n * fact(n - 1); 
        }
    }

    public static void main(String args[]) {
        System.out.println(fact(5)); 
    }
}