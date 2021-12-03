package LeetCodeQuestion;

public class RomanToInteger {
    public int getValue(char romanCharacter) {
        int value = 0;

        switch(romanCharacter) {
            case 'I':
                value = 1;
                break;
            case 'V':
                value = 5;
                break;
            case 'X':
                value = 10;
                break;
            case 'L':
                value = 50;
                break;
            case 'C':
                value = 100;
                break;
            case 'D':
                value = 500;
                break;
            case 'M':
                value = 1000;
                break;
        }

        return value;
    }

    public int romanToInt(String s) {
        int answer = 0, previousValue = 0, currentValue = 0;
        int length = s.length();

        for(int i = length - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            previousValue = currentValue;
            currentValue = getValue(ch);

            if(currentValue >= previousValue) {
                answer = answer + currentValue;
            }
            else {
                answer = answer - currentValue;
            }
        }

        return answer;
    }
}
