package LeetCodeQuestion;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();

        for(int num : nums) {
            if(frequencyMap.containsKey(num)) {
                return true;
            }
            else {
                frequencyMap.put(num, 1);
            }
        }

        return false;
    }
}
