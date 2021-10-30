package DoubtSessionOctober30;

public class SwitchCaseExample {
    public static void main(String[] args) {
        //+, -, *, /, %
        int num1 = 10;
        int num2 = 20;
        int result;
        char choice = '<';

        switch(choice) {
            case '+':
                result = num1 + num2;
                System.out.println(result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println(result);
                break;
            case '%':
                result = num1 % num2;
                System.out.println(result);
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
