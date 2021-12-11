package DivideAndConquer;

/*
Link: https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/
 */

public class LongestSubstringWithAtLeastKRepeatingCharacters {
    public int getMaximum(int num1, int num2) {
        int maximum = (num1 > num2) ? num1 : num2;

        return maximum;
    }

    public int getLengthOfLongestSubstring(String s, int k, int start, int end) {
        if(k == 1) {
            return (end - start + 1);
        }
        if(start >= end) {
            return 0;
        }

        int frequencyArray[] = new int[26];
        int result;

        for(int i = start; i <= end; i++) {
            char ch = s.charAt(i);
            int index = ch - 'a';
            frequencyArray[index] = frequencyArray[index] + 1;
        }

        for(int i = start; i <= end; i++) {
            char ch = s.charAt(i);
            int frequency = frequencyArray[ch - 'a'];

            if(frequency < k) {
                int frequency1 = getLengthOfLongestSubstring(s, k, start, i - 1);
                int frequency2 = getLengthOfLongestSubstring(s, k, i + 1, end);

                result = getMaximum(frequency1, frequency2);

                return result;
            }
        }

        result = end - start + 1;

        return result;
    }

    public int longestSubstring(String s, int k) {
        int length = getLengthOfLongestSubstring(s, k, 0, s.length() - 1);
        return length;
    }

    public static void main(String[] args) {
        String s = "abcdef";
        int k = 2;

        LongestSubstringWithAtLeastKRepeatingCharacters l
                = new LongestSubstringWithAtLeastKRepeatingCharacters();

        int length = l.longestSubstring(s, k);

        System.out.println("Length: " + length);
    }
}
