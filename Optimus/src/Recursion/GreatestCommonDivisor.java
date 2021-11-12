package Recursion;

public class GreatestCommonDivisor {
    static int findGcd(int num1, int num2) {
        int smallerNumber = (num1 < num2) ? num1 : num2;
        int largerNumber = (num1 > num2) ? num1 : num2;

        if(smallerNumber == 0) {
            return largerNumber;
        }
        else {
            int remainder = largerNumber % smallerNumber;
            int gcd = findGcd(smallerNumber, remainder);
            return gcd;
        }
    }

    public static void main(String[] args) {
        int gcd = findGcd(63, 27);
        System.out.println("GCD: " + gcd);
    }
}
