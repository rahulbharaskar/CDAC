//reverse striang

public class Stack2 {
    static final int MAX = 100;  
    int top;
    char[] a = new char[MAX];  
    Stack2() {
        top = -1;
    }
    boolean isEmpty() {
        return (top < 0);
    }
    boolean push(char x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack overflow");
            return false;
        } else {
            a[++top] = x;
            return true;
        }
    }

    char pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return a[top--];
        }
    }
    static void reverse(StringBuffer str) {
        int n = str.length();
        Stack2 s1 = new Stack2();  
        for (int i = 0; i < n; i++) {
            s1.push(str.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            char ch = s1.pop();  
            str.setCharAt(i, ch); 
        }
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Rahul Bharaskar");
        System.out.println("Original string: " + str);
        reverse(str);
        System.out.println("Reversed string: " + str);
    }
}
