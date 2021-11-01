package PreCourse.PracticeQuestion;

public class Q3ReverseOfANumber {
    public static void main(String[] args) {
        int number = 25874;
        int reverse = 0;
        int lastDigit;

        while(number > 0) {
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }

//        for(; number > 0; number = number / 10) {
//            lastDigit = number % 10;
//            reverse = reverse * 10 + lastDigit;
//        }

        System.out.println("Reverse: " + reverse);
    }
}
