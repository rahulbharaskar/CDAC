/*Question 1: Grade Classification

Write a program to classify student grades based on the following criteria:

•	If the score is greater than or equal to 90, print "A"
•	If the score is between 80 and 89, print "B"
•	If the score is between 70 and 79, print "C"
•	If the score is between 60 and 69, print "D"
If the score is less than 60, print "F
*/
import java.util.*;
class Grade { 
    public static void main(String args[]) { 
        Scanner Sc = new Scanner(System.in);
        
        System.out.println("Enter Obtained marks: "); 
        int marks = Sc.nextInt();  
        if (marks >= 90) { 
            System.out.println("Grade A"); 
        } 
        else if (marks >= 80) {  
            System.out.println("Grade B"); 
        } 
        else if (marks >= 70) {  
            System.out.println("Grade C"); 
        } 
        else if (marks >= 60) {  
            System.out.println("Grade D"); 
        } 
        else { 
            System.out.println("Grade F"); 
        } 
        
        Sc.close();  
    } 
} 


