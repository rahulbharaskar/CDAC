class recursion1{
	
	static int show(int n){// recursion method
		if(n == 4){
			return n;
			// termination condition or base condition
			// to stop extecution if condition is true
			//System.out.println("I Love You ... .... ._ _ . _ . _");
			//show();
		}else{
			return 2*show(n+1);
		}
	}
	public static void main(String args[]){
		System.out.println(show(2)); // call for method
	}
}