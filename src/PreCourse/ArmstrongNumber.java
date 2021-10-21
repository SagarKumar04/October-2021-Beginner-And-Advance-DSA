package PreCourse;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153432;
        int numberOfDigits = 0;
        int temp = num;

        while(temp > 0) {
            temp = temp / 10;
            numberOfDigits = numberOfDigits + 1;
        }

        System.out.println("Number of digits: " + numberOfDigits);
    }
}
