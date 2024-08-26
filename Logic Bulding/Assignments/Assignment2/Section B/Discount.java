/*
Question 4: Discount Calculation

Write a program to calculate the discount based on the total purchase amount. Use the following criteria:

•	If the total purchase is greater than or equal to Rs.1000, apply a 20% discount.
•	If the total purchase is between Rs.500 and Rs.999, apply a 10% discount.
•	If the total purchase is less than Rs.500, apply a 5% discount.
*/

import java.util.*;
class Discount { 
    public static void main(String[] args) { 
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Total Purchase Amount : ");
        int price = Sc.nextInt(); 
        double total; 
        boolean membership = false; 

        if (price >= 1000) { 
            if (membership) { 
                total = price * 0.25; 
            } else { 
                total = price * 0.2; 
            } 
        } else if (price >= 500 && price <= 999) { 
            if (membership) { 
                total = price * 0.15; 
            } else { 
                total = price * 0.1; 
            } 
        } else { // price < 500
            if (membership) { 
                total = price * 0.1; 
            } else { 
                total = price * 0.05; 
            } 
        } 

        System.out.println("Total : " + total); 
    } 
}
