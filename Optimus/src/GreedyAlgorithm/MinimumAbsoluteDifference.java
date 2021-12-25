package GreedyAlgorithm;

/*
URL: https://leetcode.com/problems/minimum-absolute-difference/
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        Arrays.sort(arr);
        int minDifference = Integer.MAX_VALUE;

        for(int i = 1; i < arr.length; i++) {
            int difference = arr[i] - arr[i - 1];

            if(difference > minDifference) {
                continue;
            }

            if(difference < minDifference) {
                minDifference = difference;

                result.clear();
            }
            result.add(Arrays.asList(arr[i - 1], arr[i]));
        }

        return result;
    }

    public static void main(String[] args) {
        MinimumAbsoluteDifference minimumAbsoluteDifference = new MinimumAbsoluteDifference();

        int arr[] = {3, 8, -10, 23, 19, -4, -14, 27, 28};

        List<List<Integer>> result =
                minimumAbsoluteDifference.minimumAbsDifference(arr);

        System.out.println(result);
    }
}
