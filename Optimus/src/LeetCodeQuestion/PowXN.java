package LeetCodeQuestion;

/*
Link: https://leetcode.com/problems/powx-n/

Implement pow(x, n), which calculates x raised to the power n (i.e., x ^ n).
 */

public class PowXN {
    public double getPower(double x, int n) {
        double tempPower;
        if(n == 0) {
            tempPower = 1;
        }
        else if(n == 1) {
            tempPower = x;
        }
        else {
            tempPower = getPower(x, n / 2);
            if(n % 2 == 0) {
                tempPower = tempPower * tempPower;
            }
            else {
                tempPower = x * tempPower * tempPower;
            }
        }

        return tempPower;
    }

    public double myPow(double x, int n) {
        double finalAnswer;
        if(n == 0) {
            finalAnswer = 1;
        }
        else {
            if(n > 0) {
                finalAnswer = getPower(x, n);
            }
            else {
                finalAnswer = 1 / getPower(x, n);
            }
        }

        return finalAnswer;
    }
}
