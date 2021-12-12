package Collections;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String s = "programming";
        Map<Character, Integer> frequencyMap = new HashMap<Character, Integer>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            int frequency = 1;
            if(frequencyMap.containsKey(ch)) {
                frequency = frequencyMap.get(ch) + 1;
            }
            frequencyMap.put(ch, frequency);
        }

        System.out.println("Frequency Map: " + frequencyMap);
    }
}
