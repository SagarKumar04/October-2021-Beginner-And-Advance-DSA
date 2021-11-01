package PreCourse.PracticeQuestion;

public class Q2PrimeFactorMethod2 {
    public static void main(String[] args) {
        int number = 12;
        int numberOfFactors = 0;

        for(int i = 2; i <= number / 2; i++) {
            if(number % i == 0) {
                numberOfFactors++;
            }
        }

        if(numberOfFactors == 0) {
            System.out.println("Prime Number.");
        }
        else {
            System.out.println("Not a Prime Number.");
        }
    }
}
