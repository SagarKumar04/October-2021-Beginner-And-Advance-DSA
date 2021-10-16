package PreCourse.SelectionStatements;

public class SwitchExample {
    public static void main(String[] args) {
        int num1 = 10, num2 = 8, result = 0;

        /*
        1 - add
        2 - subtract
        3 - multiply
        4 - quotient
        5 - remainder
         */
        int choice = 2;

        switch(choice) {
            case 1:
                System.out.println("Case 1");
                result = num1 + num2;
                break;
            case 2:
                System.out.println("Case 2");
                result = num1 - num2;
                break;
            case 3:
                System.out.println("Case 3");
                result = num1 * num2;
                break;
            case 4:
                System.out.println("Case 4");
                result = num1 / num2;
                break;
            case 5:
                System.out.println("Case 5");
                result = num1 % num2;
                break;
            default:
                System.out.println("Wrong choice.");
        }

        System.out.println("Result: " + result);
    }
}
