package LeetCodeQuestion;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
        int maxFreq = 0, maxValue = Integer.MIN_VALUE;

        for(int num : nums) {
            int frequency;
            if(frequencyMap.containsKey(num)) {
                frequency = frequencyMap.get(num);
                frequency = frequency + 1;
            }
            else {
                frequency = 1;
            }

            if(frequency > nums.length / 2) {
                maxValue = num;
                break;
            }

            frequencyMap.put(num, frequency);
        }

        return maxValue;
    }
}
