
//6. Write a Java program that calculates the area of a rectangle using the formula area = length * width. Use predefined values for length and width.

import java.util.*;

public class Areaofrectangle{
    public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the Height of Rectangle :");
		int Height = Sc.nextInt(); 
		System.out.println("Enter the Width of Rectangle :");
		int Width = Sc.nextInt(); 
		
        int area = Height * Width;

        System.out.println("The area of Rectangle is: " + area);
    }
}