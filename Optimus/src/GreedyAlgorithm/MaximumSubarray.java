package GreedyAlgorithm;

/*
URL: https://leetcode.com/problems/maximum-subarray/
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int sum = 0, maxSum = Integer.MIN_VALUE, maxElement = nums[0];

        for(int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];

            if(sum < 0) {
                sum = 0;
            }

            if(sum > maxSum) {
                maxSum = sum;
            }

            if(nums[i] > maxElement) {
                maxElement = nums[i];
            }
        }

        if(maxSum == 0) {
            maxSum = maxElement;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int nums[] = {-2, -3, -4, -2, -5, -4};

        MaximumSubarray maximumSubarray = new MaximumSubarray();
        int maxSum = maximumSubarray.maxSubArray(nums);

        System.out.println(maxSum);
    }
}
