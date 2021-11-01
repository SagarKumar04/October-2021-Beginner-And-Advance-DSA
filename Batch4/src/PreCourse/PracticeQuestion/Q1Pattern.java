package PreCourse.PracticeQuestion;

/*
WAP to print the below pattern:
1
2 3
4 5 6
7 8 9 10
 */

public class Q1Pattern {
    public static void main(String[] args) {
        int n = 5;
        int number = 1;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}