// Array Implementation

public class stack {
	static final int MAX = 10;
	int top;
	int a[] = new int[Max];
	stack(){
		top = -1;
	}
	//underflow 
	boolean isEmpty(){
		return(top < 0);
	}
	//insertion in stack
	boolean push(int x){
		if(top >= (MAX - 1)){
			
			System.out .printlm("Sack overflow");
			return false;
			
		}
		a[++top] = x;
		return true;
	}
	
	// deletion
	int pop(){
		if(top< 0){
			System.out.println("Stack Underflow");
			return 0;
		}
		return a[top --];
	}
	//
	/*
	int peek(){
		return(top<0)?0:a[top];
	}*/
	int peek() {
    if (top < 0) {
        return 0;  
    } else {
        return a[top];  
    }
	
	void display(){
		if(isEmpty()){
		System.out.println("Empty Stack");
		}
		else{
			System.out.println("Stack elements are: ");
			show(top);
			System.out.println();
		}
		
	}
	void show(){
		if(index< 0)
			return;
		System.out.println(a[index]+ "");
		show(index -1); // recursion call
	}
		
	public static void main(String [] args){
		Stack s1 = new Stack();
		s1.push(10);
        s1.push(20);
        s1.push(30);
		s1.push(40);
        s1.push(45);
        s1.push(14);
		
		s1.display();
		s1.show();
		
		 System.out.println("Top element is: " + s1.peek());
        System.out.println(s1.pop() + " popped from stack");
        s1.display();
		
	}
}