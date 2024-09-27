class recursion2 {

    static int fact(int n) { // recursive method
        if (n <= 1) {
            return 1;
        } else {
            return n * fact(n - 1); // recursive call
        }
    }

    public static void main(String args[]) {
        System.out.println(fact(5)); // call for method
    }
}
