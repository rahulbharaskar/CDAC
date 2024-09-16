package ass.six.eight;

import java.util.Scanner;

class DhamDhum {
    private int[] arr;  
    public DhamDhum(int size) {
        arr = new int[size];  
    }
    public void setArrayValues() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + arr.length + " integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
    }
    public int[] getArrayValues() {
        return arr;
    }
    public void printArray() {
        System.out.println("Array elements are:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();  
    }
}
public class ArrayWithgetset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        DhamDhum DJ = new DhamDhum (size);
        DJ.setArrayValues();
        
       DJ.printArray(); 
        scanner.close();
    }
    
}


