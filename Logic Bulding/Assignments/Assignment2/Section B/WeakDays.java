/*
2. Write a program that uses a nested switch statement to print out the day of the week based on an integer input (1 for Monday, 2 for Tuesday, etc.). Additionally, within each day, print whether it is a weekday or weekend.
*/
class Days{ 
	public static void main(String args[]){ 
		int day = 4; 
		switch(day){ 
			case 1 :  
				System.out.println("Today is Monday"); 
				break; 
			case 2 :  
				System.out.println("Today is Tuesday"); 
				break; 
			case 3 :  
				System.out.println("Today is Wednesday"); 
				break; 
			case 4 :  
				System.out.println("Today is Thursday");
				break; 
			case 5 :  
				System.out.println("Today is Friday"); 
				break; 
			case 6 :  
				System.out.println("Today is Saturday"); 
				break; 
			case 7 :  
				System.out.println("Today is Sunday"); 
			break; 
			case 8 :  
				System.out.println("Invalid Day"); 
				break;      
		} 
	} 
}
