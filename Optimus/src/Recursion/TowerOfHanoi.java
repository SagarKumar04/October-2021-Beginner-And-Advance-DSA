package Recursion;

public class TowerOfHanoi {
    static void solveTowerOfHanoi(int n, char source, char destination, char helper) {
        if(n == 1) {
            System.out.println("Move disk 1 from rod " + source + " to rod " + destination);
        }
        else {
            solveTowerOfHanoi(n - 1, source, helper, destination);
            System.out.println("Move disk " + n + " from rod " + source + " to rod " + destination);
            solveTowerOfHanoi(n - 1, helper, destination, source);
        }
    }

    public static void main(String[] args) {
        int n = 4;

        /*
        Source - A
        Helper - B
        Destination - C
         */
        solveTowerOfHanoi(n, 'A', 'C', 'B');
    }
}
