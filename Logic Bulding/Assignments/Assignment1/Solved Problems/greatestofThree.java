//7. Write a Java program that finds and prints the largest of three predefined numbers using if-else statements.
import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.println("Enter the numbers:");
		System.out.println("Enter 1st number:");
        int num1 = sc.nextInt();
		System.out.println("Enter 2nd number:");
        int num2 = sc.nextInt();
		System.out.println("Enter 3rd number:");
        int num3 = sc.nextInt();
		System.out.println("Enter number:");

        if (num1 > num2 && num1 > num3) {
            System.out.println("Greatest of " + num1 + ", " + num2 + ", and " + num3 + " is: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Greatest of " + num1 + ", " + num2 + ", and " + num3 + " is: " + num2);
        } else {
            System.out.println("Greatest of " + num1 + ", " + num2 + ", and " + num3 + " is: " + num3);
        }
    }
}


/*
public class greatestofthree{
	public static void main(String[] args){
		Scanner Sc = new Scanner(System.in);
		int num1 = Sc.nextInt();
		int num2 = Sc.nextInt();
		int num3 = Sc.nextInt();
		if(num1 > num2 && num1 >num 3){
			System.out.println("Greatest of " + num1 + ", " + num2 + ", and " + num3 + " is: " + num1);
		}
		else if(num2 > num1 && num2 > num3){
			System.out.println("Greatest of " + num1 + ", " + num2 + ", and " + num3 + " is: " + num2);
		}
		else{
			System.out.println("Greatest of " + num1 + ", " + num2 + ", and " + num3 + " is: " + num3);
		}
	}
}*/