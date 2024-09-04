// using switch case
import java.util.*;
public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
	
		 int isLeap=((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)? 1: 0);
			switch (isLeap) {
				case 1:
					System.out.println(year + " is a leap year.");
					break;
				case 0:
					System.out.println(year + " is not a leap year.");
					break;
			}
        
	}
}