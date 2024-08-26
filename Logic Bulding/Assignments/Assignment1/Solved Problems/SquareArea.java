//5. Write a Java program that calculates the area of a square using the formula area = side * side. Use a predefined side length
import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        System.out.println("Enter the length of the side of the square:");
        Scanner sc = new Scanner(System.in);

        int side = sc.nextInt(); 
        int area = side * side;  

        System.out.println("The area of the square with side length " + side + " is: " + area);
    }
}

