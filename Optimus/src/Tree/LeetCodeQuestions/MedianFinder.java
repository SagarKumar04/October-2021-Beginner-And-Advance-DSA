package Tree.LeetCodeQuestions;

/*
URL: https://leetcode.com/problems/find-median-from-data-stream/
 */

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {
    private PriorityQueue<Integer> small;
    private PriorityQueue<Integer> large;
    private boolean isEven;

    public MedianFinder() {
        small = new PriorityQueue<Integer>(Collections.reverseOrder());
        large = new PriorityQueue<Integer>();
        isEven = true;
    }

    public void addNum(int num) {
        if(isEven) {
            large.offer(num);
            small.offer(large.poll());
        }
        else {
            small.offer(num);
            large.offer(small.poll());
        }

        isEven = !isEven;
    }

    public double findMedian() {
        if(isEven) {
            return ((small.peek() + large.peek()) / 2.0);
        }
        else {
            return small.peek();
        }
    }
}
