//1)Write a program that checks if a given year is a leap year or not using both if-else and switch-case.
// using operator 
import java.util.*;
public class LeapYearCheck{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter year: ");
		int year = scanner.nextInt();
		
		if((year % 4 == 0 && year % 100 == 0) || (year % 400 == 0)){
			  System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
		scanner.close();
    }
}

// using nested if else 
	/*
	import java.util.*;
	public class LeapYearCheck{
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter year: " );
			int year = scanner.nextInt();
		if(year % 4 == 0){
			if (year % 100 == 0) {
                if (year % 400 == 0);
				System.out.println(year + " is a leap year.");
				
            } else {
                System.out.println(year + " is a leap year.");
            }
        } else {
            System.out.println(year + " is Not leap year.");
		}
    }
}
	*/
  



		

	