//4)Write a program that takes a month (1-12) and prints the corresponding season (Winter, Spring, Summer, Autumn) using a switch case

import java.util.*;
public class ToCheckMansun{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a month : ");
        int month = scanner.nextInt();
		
		switch (month) {
			
			case 12: 
			case 1:  
			case 2:
				System.out.println("season is Winter");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("season is spring");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("season is summer");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("season isd Autum");
				break;
			default:
				System.out.println("Enter valid Month number");
				break;
		}
		
	}
}