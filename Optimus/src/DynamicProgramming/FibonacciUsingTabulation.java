package DynamicProgramming;

public class FibonacciUsingTabulation {
    final int N = 20;
    int fibonacci[] = new int[N + 1];

    int setFibonacci(int n) {
        int nthFibonacci;

        if(n <= 0) {
            nthFibonacci = -1;
        }
        else {
            fibonacci[0] = -1;
            fibonacci[1] = 0;
            fibonacci[2] = 1;

            for(int i = 3; i <= n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }

            nthFibonacci = fibonacci[n];
        }

        return nthFibonacci;
    }

    public static void main(String[] args) {
        FibonacciUsingTabulation f = new FibonacciUsingTabulation();

        int term = 11;
        int result = f.setFibonacci(term);

        if(result != -1) {
            System.out.println("Fibanacci: " + result);
        }
        else {
            System.out.println("Invalid term: " + term);
        }
    }
}
