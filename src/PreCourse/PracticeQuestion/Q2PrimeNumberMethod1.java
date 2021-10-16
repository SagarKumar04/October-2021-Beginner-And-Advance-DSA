package PreCourse.PracticeQuestion;

public class Q2PrimeNumberMethod1 {
    public static void main(String[] args) {
        int number = 11;
        int numberOfFactors = 0;

        for(int i = 1; i <= number; i++) {
            if(number % i == 0) {
                numberOfFactors++;
            }
        }

        if(numberOfFactors == 2) {
            System.out.println("Prime Number.");
        }
        else {
            System.out.println("Not a Prime Number.");
        }
    }
}
