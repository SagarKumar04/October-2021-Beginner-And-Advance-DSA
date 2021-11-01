package RevisionSessionNov1;

//1. Import Scanner class
import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        //2. Create an object of Scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the day: ");

        /*
        3. Use appropriate function of Scanner class
        int -> nextInt()
        float -> nextFloat()
        double -> nextDouble()
        char -> next().charAt(0)
        String -> next(), nextLine()
         */
        int day = scanner.nextInt();

        day = 4 * 3 - 7;

        switch(day) {
            case 1:
                switch(1) {
                    case 1:
                        System.out.println("Test");
                }
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
