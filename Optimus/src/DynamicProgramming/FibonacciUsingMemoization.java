package DynamicProgramming;

//Memoization: Top-Down Approach

public class FibonacciUsingMemoization {
    final int N = 10;
    final int NIL = -1;
    int fibonacci[] = new int[N + 1];

    void initialize() {
        for(int i = 0; i <= N; i++) {
            fibonacci[i] = NIL;
        }
    }

    int setFibonacci(int n) {
        int nthFibonacci = -1;
        if(n <= 0) {

        }
        else if(n <= 2) {
            fibonacci[n] = n - 1;
        }
        else {
            if(fibonacci[n] == NIL) {
                fibonacci[n] = setFibonacci(n - 1) + setFibonacci(n - 2);
                //nthFibonacci = fibonacci[n];
            }
        }

        nthFibonacci = fibonacci[n];

        return nthFibonacci;
    }

    public static void main(String[] args) {
        FibonacciUsingMemoization f = new FibonacciUsingMemoization();

        f.initialize();
        int term = 10;
        int result = f.setFibonacci(term);

        if(result != -1) {
            System.out.println("Fibanacci: " + result);
        }
        else {
            System.out.println("Invalid term: " + term);
        }
    }
}
