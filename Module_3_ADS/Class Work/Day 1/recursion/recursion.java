class recursion{
	static int i = 0;
	static void show(){// recursion method
		++i;
		if(i<=5){
			// termination condition or base condition
			// to stop extecution if condition is true
			System.out.println("I Love You ... .... ._ _ . _ . _");
			show();
		}
	}
	public static void main(String args[]){
		show(); // call for method
	}
}