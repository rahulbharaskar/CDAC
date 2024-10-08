
//Snippet 1:  
/*public class Main {
    public static void main(String[] args){ 
	  System.out.println("Hello, World!");
}
error:'main' method is not declared 'public static' in privious version of code
}*/
//Snippet 2: 
/*public class Main {
    public static void main(String[] args){ 
	  System.out.println("Hello, World!");
error:'main' method is not declared 'public static' in privious version of code
}
}*/
//Snippet 3:
  
/*public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
        //return 0; 
	   //'main' method is not declared with a return type of 'void'
	   //public static int main(String[] args) int replace with void
    } 
 
 
} 
//Snippet 4:
public class Main {
	public static void main() { 
		System.out.println("Hello, World!");
	}
}
*/
//Snippet 5:
/*
public class Main {
	public static void main(String[] args) { 
		System.out.println("Main method with String[] args");
		int[] intArgs = {1, 2, 3};
        main(intArgs);
	}
	 
public static void main(int[] args) {
	System.out.println("Overloaded main method with int[] args");
	}
}
//Snippet 6:
public class Main {
	public static void main(String[] args) {
		int y = 15;
		int x = y + 10; 
		System.out.println(x);
    }
}
//Snippet 7:
public class Main {
	public static void main(String[] args) { 
	String x = "Hello"; 
	System.out.println(x);
	}
}

//Snippet 8:
public class Main {
	public static void main(String[] args) { 
	System.out.println("Hello, World!");
	//error: ')' expected in last code
	}
}*/
/*
//Snippet 9:
public class Main {
	public static void main(String[] args) { 
	int class = 10; 
	System.out.println(class);
	/*eeror: java:74: error: not a statement
        int class = 10; System.out.println(class);
        ^
Demo3.java:74: error: ';' expected
        int class = 10; System.out.println(class);
           ^
Demo3.java:74: error: <identifier> expected
        int class = 10; System.out.println(class);
                 ^
Demo3.java:74: error: illegal start of expression
        int class = 10; System.out.println(class);
                                           ^
Demo3.java:74: error: <identifier> expected
        int class = 10; System.out.println(class);
	}
}*/

//Snippet 9:
/*
public class Main {
	public static void main(String[] args) { 
		int myclass = 10; 
		System.out.println(myclass);
	}
}*/
//Snippet 10:
/*
public class Main { 
	public void display() {
		System.out.println("No parameters");
	}
	public void display(int num) { 
		System.out.println("With parameter: " + num);
	}
	public static void main(String[] args) {
		Main m = new Main();
		
		m.display();
		m.display(5);
	}
}*/
//Snippet 11:
/*public class Main {
	public static void main(String[] args) { 
	int[] arr = {1, 2, 3}; 
	System.out.println(arr[2]);
	}
}
*/
//Snippet 12:
/*
public class Main {
    public static void main(String[] args) { 
        int a = 0;
        while (true) {
            System.out.println("Iteration: " + a);
            a++;
            if (a >= 5) {
                break; // Exit the loop when counter reaches 5
            }
        }
    }
}
*/
//Snippet 13:
/*
public class Main {      
	public static void main(String[] args) {  
		String str = null;  
		if (str != null) { 
			System.out.println(str.length());
		}
		 	else {
	  
			System.out.println("String is null");  
		} 
	}  
} 

//Snippet 14:
public class Main {      
	public static void main(String[] args) {  
		double num = 10.5; // Assigning a valid double value 
		System.out.println(num);  
   }  
} */
//Snippet 15:
/*
public class Main {
	public static void main(String[] args) { 
		int num1 = 10;
		double num2 = 5.5;
		double result = num1 + num2; 
		System.out.println(result);
	}
}*/
/*//Snippet 16:
public class Main {
	public static void main(String[] args) {
		int num = 10;
		double result = num / 4; 
		System.out.println(result);
	}
}*/
/*//Snippet 17:
public class Main {
	public static void main(String[] args) { 
		int a = 10;
		int b = 5;
		double result= Math.pow(a, b); 
		System.out.println(result);
	}
}
*/
//Snippet 18:
/*
public class Main {
	public static void main(String[] args) { 
		int a = 10;
		
		int b = 5;
		int result = (
		a + b) * 2; 
		System.out.println(result);
	}
}*/
/*//Snippet 19:
public class Main {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {             
			int result = a / b;             
			System.out.println(result);         
		}	
		catch (ArithmeticException e) {             
			System.out.println("Division by zero is not allowed.");         
		}   
		
	}
}*/
/*//Snippet 20:
public class Main {
	public static void main(String[] args) { 
		System.out.println("Hello, World");
	}
}*/
/*//Snippet 21:
public class Main {
	public static void main(String[] args) { 
		System.out.println("Hello, World!");
// Missing closing brace here
	}
}*/
/*//Snippet 22:
public class Main {
    public static void main(String[] args) { 
        // Call the displayMessage method here
        displayMessage();
    }

    // Define the displayMessage method outside of main
    public static void displayMessage() {
        System.out.println("Message");
    }
}
*/
/*//  Snippet 223:
public class Confusion {     
    public static void main(String[] args) {  
        int value = 2;          
        switch(value) {              
            case 1:  
                System.out.println("Value is 1"); 
                break; // Exit the switch block after this case 
            case 2:  
                System.out.println("Value is 2"); 
                break; // Exit the switch block after this case 
            case 3:  
                System.out.println("Value is 3"); 
                break; // Exit the switch block after this case 
            default:  
                System.out.println("Default case"); 
                break; // Exit the switch block after this case 
        }  
    }  
}*/
/*//Snippet 24:
public class MissingBreakCase {
	public static void main(String[] args) { 
		int level = 1;
		switch(level) { 
			case 1:
				System.out.println("Level 1");
			case 2:
				System.out.println("Level 2");
			case 3:
				System.out.println("Level 3"); 
			default:
				System.out.println("Unknown level");
		}
	}
}
*/
/*//Snippet 25:
public class Switch {
	public static void main(String[] args) { 
		double score = 85.0;
			switch(score) { 
				case 100:
					System.out.println("Perfect score!"); 
					break;
				case 85:
					System.out.println("Great job!"); 
					break;
				default:
					System.out.println("Keep trying!");
			}
		}
}*/
/*snippet 25
public class Switch {      
	public static void main(String[] args) {          
		double score = 85.0;  
		int scoreInt = (int) score; // Cast the double to int 
			switch(scoreInt) {              
				case 100:  
					System.out.println("Perfect score!");                  
					break;              
				case 85:  
					System.out.println("Great job!");                  
					break;              
				default:  
					System.out.println("Keep trying!"); 
			} 
	}  
} */
//Snippet 26:
public class Switch {  
	public static void main(String[] args) {          
		int number = 5;      
		switch(number) {            
			case 5:  
				System.out.println("Number is 5");  
				// No need for another case 5 
				break;              
			default:  
				System.out.println("This is the default case");  
		}  
	}  
} 








  
 

























 


















