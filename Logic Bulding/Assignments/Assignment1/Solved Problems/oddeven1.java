import java.util.*;
public class EvenOdd{
	public static void main(String[] args){
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2==0){
			System.out.println("The given number is Even");
			}
		else{
			System.out.println("the given number is Odd");
			}
    }
}