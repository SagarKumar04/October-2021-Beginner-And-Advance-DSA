package DoubtSessionOctober30;

/*
Input Format

Every line of input will contain a String followed by an integer.
Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .

Output Format

In each line of output there should be two columns:
The first column contains the String and is left justified using exactly  characters.
The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

Sample Input

java 100
cpp 65
python 50
Sample Output

================================
java           100
cpp            065
python         050
================================
*/
import java.util.Scanner;

public class HackerrankQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
            String str = scanner.next();
            int num = scanner.nextInt();

            System.out.printf("%-15s", str);
            /*
            %s -> prints the string
            %15s -> prints the string in 15 spaces (right justified)
            %-15s -> prints the string in 15 spaces (left justified)
             */
            System.out.printf("%03d", num);
            /*
            %d -> prints the integer
            %3d -> prints the integer in 3 spaces
            %03d -> prints the integer in 3 spaces (pads '0' if the number has less than three digits
             */
            System.out.println();
        }
    }
}
