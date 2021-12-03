package LeetCodeQuestion;

/*
Link: https://leetcode.com/problems/count-good-numbers/

A digit string is good if the digits (0-indexed) at even indices are even and the digits at odd indices are prime (2, 3, 5, or 7).

For example, "2582" is good because the digits (2 and 8) at even positions are even and the digits (5 and 2) at odd positions are prime. However, "3245" is not good because 3 is at an even index but is not even.
Given an integer n, return the total number of good digit strings of length n. Since the answer may be large, return it modulo 109 + 7.

A digit string is a string consisting of digits 0 through 9 that may contain leading zeros.
 */

public class CountGoodNumbers {
    int mod = (int)1e9 + 7;

    public long getPower(long x, long n) {
        long tempPower;
        if(n == 0) {
            tempPower = 1;
        }
        else if(n == 1) {
            tempPower = x;
        }
        else {
            tempPower = getPower(x, n / 2) % mod;
            if(n % 2 == 0) {
                tempPower = tempPower * tempPower;
            }
            else {
                tempPower = x * tempPower * tempPower;
            }
        }

        return tempPower;
    }

    public int countGoodNumbers(long n) {
        long odd = n / 2;
        long even = n - odd;

        long oddGoodNumbers = getPower(4, odd) % mod;
        long evenGoodNumbers = getPower(5, even) % mod;

        int totalGoodNumbers = (int)((oddGoodNumbers * evenGoodNumbers) % mod);

        return totalGoodNumbers;
    }
}
