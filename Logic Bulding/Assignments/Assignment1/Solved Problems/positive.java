
//1. Write a Java program that checks if a predefined number is positive using an if-else statement and prints the appropriate message.

import java.util.*;
public class Positivenumber{
	public static void main(String[] args){
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>0){
			System.out.println("The given number is positive");
			}
		else{
			System.out.println("the given number is negative");
			}
	}
}

/*
public class positive{
	public static void main(String[] args){
		int a = 15;
		if(a>0){
			System.out.println("The given number is positive");
			}
		else{
			System.out.println("the given number is neagative");
			}
}
}
*/



		
