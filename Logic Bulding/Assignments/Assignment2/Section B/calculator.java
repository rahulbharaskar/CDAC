/*Question 3: Calculator

Write a program that acts as a simple calculator. It should accept two numbers and an operator (+, -, *, /) as input. Use a switch statement to perform the appropriate operation. Use nested if- else to check if division by zero is attempted and display an error message.
*/


import java.util.Scanner;

class Calculator { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        double num1, num2, result; 
        char operator; 

        System.out.println("Enter first number: "); 
        num1 = sc.nextDouble(); 

        System.out.println("Enter operator (+, -, *, /): "); 
        operator = sc.next().charAt(0); 

        System.out.println("Enter second number: "); 
        num2 = sc.nextDouble(); 

        if (operator == '+') { 
            result = num1 + num2; 
        } else if (operator == '-') { 
            result = num1 - num2; 
        } else if (operator == '*') { 
            result = num1 * num2; 
        } else if (operator == '/') { 
            if (num2 != 0) { 
                result = num1 / num2; 
            } else { 
                System.out.println("Error: Division by zero is not allowed"); 
                return; 
            } 
        } else { 
            System.out.println("Invalid operator"); 
            return; 
        } 

        System.out.println("Result: " + result); 
    } 
}
