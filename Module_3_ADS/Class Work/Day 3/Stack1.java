public class Stack {
    static final int MAX = 10;  
    int top;
    int a[] = new int[MAX];  

    Stack() {
        top = -1;
    }

    boolean isEmpty() {
        return (top < 0);
    }
    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x);
            return true;
        }
    }
    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }
    int peek() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return 0;  // Indicate that the stack is empty
        } else {
            return a[top];
        }
    }


    void display() {
        if (top < 0) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
    void show() {
        if (top < 0) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + a[top]);
            System.out.println("Bottom element: " + a[0]);
        }
    }
    public static void main(String[] args) {
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
