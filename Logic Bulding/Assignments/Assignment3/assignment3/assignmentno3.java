//Snippet 1:
/*public class InfiniteForLoop {
		public static void main(String[] args) { 
			for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}
// Error to investigate: Why does this loop run infinitely? How should the loop control variable be adjusted?
*/

//Snippet 2:
/*
public class IncorrectWhileCondition { 
	public static void main(String[] args) {
		int count = 5; 
		while (count != 0) { // corrcted loop condition
			System.out.println(count); 
			count--;
		}
	}
}
// Error to investigate: Why does the loop not execute as expected? What is the issue with the condition in the
//`while` loop?
*/

//Snippet 3:
 /*public class DoWhileIncorrectCondition { 
	public static void main(String[] args) {
		int num = 5;
		do {
			System.out.println(num); 
			num++;
		} while (num < 5);
 
	}
}*/
/*
public class CorrectWhileCondition {     
    public static void main(String[] args) { 
        int count = 5;  // Initialize the count variable to 5
        while (count > 0) {  // Continue looping while count is greater than 0
            System.out.println(count);  // Print the current value of count
            count--;  // Decrement count by 1 after each iteration
        }  
    }  
}

// Error to investigate: Why does the loop only execute once? What is wrong with the loop condition in the `do- while` loop?
//Snippet 4:
*/
/*
public class OffByOneErrorForLoop { 
	public static void main(String[] args) {
		for (int i = 1; i <10; i++) { 
			System.out.println(i);
		}
// Expected: 10 iterations with numbers 1 to 10
// Actual: Prints numbers 1 to 10, but the task expected only 1 to 9
	}
}
// Error to investigate: What is the issue with the loop boundaries? How should the loop be adjusted to meet the expected output?
*/
//Snippet 5:
/*
public class WrongInitializationForLoop { 
	public static void main(String[] args) {
		for (int i = 10; i >= 0; i--) { 	
			System.out.println(i);
		}
	}
}
// Error to investigate: Why does this loop not print numbers in the expected order? What is the problem with the initialization and update statements in the `for` loop?
*/

//Snippet 6:
/*
public class MisplacedForLoopBody { 
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(i); 
			System.out.println("Done");
		}
	}
}
// Error to investigate: Why does "Done" print only once, outside the loop? How should the loop body be enclosed to include all statements within the loop?
*/

//Snippet 7:
/*
public class UninitializedWhileLoop { 
	public static void main(String[] args) {
		int count= 0;
 
		while (count < 10) {
			System.out.println(count); 
			count++;
		}
	}
}
// Error to investigate: Why does this code produce a compilation error? What needs to be done to initialize the loop variable properly?
*/
//Snippet 8:
/*
public class OffByOneDoWhileLoop { 
	public static void main(String[] args) {
		int num = 1; 
		do {
			System.out.println(num); 
			num++;
		} while (num <= 5);
	}
}
// Error to investigate: Why does this loop print unexpected numbers? What adjustments are needed to print the numbers from 1 to 5?
*/
/*
//Snippet 9:

public class InfiniteForLoopUpdate { 
	public static void main(String[] args) {
		for (int i = 0; i < 5; i += 2) { 
			System.out.println(i);
		}
	}
}
// Error to investigate: Why does the loop print unexpected results or run infinitely? How should the loop update expression be corrected?
*/

/*
//Snippet 10:
public class IncorrectWhileLoopControl { 
    public static void main(String[] args) {
        int num = 10;     
        while (num > 0) {  // Correct the condition to loop while num is greater than 0
            System.out.println(num); 
            num--;
        }
    }
}

// Error to investigate: Why does the loop execute indefinitely? What is wrong with the loop condition?
*/

//Snippet 11:
/*
public class IncorrectLoopUpdate { 
    public static void main(String[] args) {
        int i = 0; 
        while (i < 5) {
            System.out.println(i);
            i++;  // Increment by 1 to include all integers from 0 to 4
        }
    }
}

// Error to investigate: What will be the output of this loop? How should the loop variable be updated to achieve the desired result?
*/
/*
//Snippet 12:

public class LoopVariableScope {
	public static void main(String[] args) { 
		int x = 0;// Declare x outside the loop
		for (int i = 0; i < 5; i++) {
				x = i * 2;
		
		}
		System.out.println(x); // Error: 'x' is not accessible here
	}
}
// Error to investigate: Why does the variable 'x' cause a compilation error? How does scope
*/
// section 2
/*
//Snippet 1:
public class NestedLoopOutput {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.print(i + " " + j + " ");
            }
            System.out.println();
        }
    }
}
*/
/*
//Snippet 2:

public class DecrementingLoop {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 5; i > 0; i--) {
            total += i;
            if (i == 3) continue;
            total -= 1;
        }
        System.out.println(total);
    }
}
*/
/*
//Snippet 3:
public class WhileLoopBreak {
    public static void main(String[] args) {
        int count = 0;
        while (count < 5) {
            System.out.print(count + " ");
            count++;
            if (count == 3) 
				break;
        }
        System.out.println(count);
    }
}
*/
/*
//Snippet 4

public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i < 5);
        System.out.println(i);
    }
}
*/
/*
//Snippet 5:
public class ConditionalLoopOutput {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 4; i++) {
            if (i % 2 == 0) {
                num += i;
            } else {
                num -= i;
            }
        }
        System.out.println(num);
    }
}
*/
/*
//Snippet 6
public class IncrementDecrement {
    public static void main(String[] args) {
        int x = 5;
        int y = ++x - x-- + --x + x++;
        System.out.println(y);
    }
}
*/
/*
//Snippet 7:
public class NestedIncrement {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int result = ++a * b - a + b++;
        System.out.println(result);
    }
}
*/
/*
//Snippet 8:
public class LoopIncrement {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            count += i++ - ++i;
        }
        System.out.println(count);
    }
}
*/
// section 1,2 is done






