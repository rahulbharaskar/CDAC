// 3. Write a Java program that checks if a predefined number is odd or even. Use an if-else statement and the modulus operator (%) to determine whether the number is divisible by 2 or not.

import java.util.*;
public class EvenOdd{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		//Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2==0){
			System.out.println("The given number is Even");
			}
		else{
			System.out.println("the given number is Odd");
			}
    }
}