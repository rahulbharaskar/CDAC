// 2. Write a Java program that checks if a predefined number is negative using an if-else statement and displays the result.


import java.util.*;
public class Positivenumber{
	public static void main(String[] args){
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<0){
			System.out.println("The given number is negative");
			}
		else{
			System.out.println("the given number is positive");
			}
	}
}

/*
public class negative{
	public static void main(String[] args){
		int n = -15;
		if(n<0){
			System.out.println("The given number is negative");
			}
		else{
			System.out.println("the given number is positive");
			}
}
}
*/