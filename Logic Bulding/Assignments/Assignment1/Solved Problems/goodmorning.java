// 4. Write a Java program that displays a "Good Morning" message if the predefined time is between 5 AM and 12 PM. Use an if statement to implement the logic.
import java.util.*;
public class Goodmorning{
	public static void main(String[] args){
		System.out.println("Enter a time in hours: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>=5 && n<12){
			System.out.println("Good Morning");
		}
		else{
			System.out.println("Good Day");
		}
	}
}