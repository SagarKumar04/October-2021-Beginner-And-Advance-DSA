package LeetCodeQuestion;

public class SqrtX {
    public int mySqrt(int x) {
        int left = 1, right = x / 2;

        if(x == 0 || x == 1) {
            return x;
        }
        else {
            while(left <= right) {
                long mid = left + (right - left) / 2;
                long midSquare = mid * mid;

                if(x < midSquare) {
                    right = (int)mid - 1;
                }
                else if(x > midSquare) {
                    left = (int)mid + 1;
                }
                else {
                    return (int)mid;
                }
            }
        }

        return right;
    }
}
