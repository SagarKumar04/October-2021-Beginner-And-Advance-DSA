package RevisionSessionNov2;

public class FunctionExample {
    //Receives parameters and returns a value
    static int add1(int num1, int num2) {
        int sum = num1 + num2;

        return sum;
    }

    //Receives parameters and does not return a value
    static void add2(int num1, int num2) {
        int sum = num1 + num2;

        System.out.println("add2: " + sum);
    }

    //Does not receive a parameter and returns a value
    static int add3() {
        int sum = 30 + 40;

        return sum;
    }

    //Does not receive parameter and does not return a value
    static void add4() {
        int sum = 40 + 50;

        System.out.println("add4: " + sum);
    }

    void func() {
        System.out.println("Inside func() method");
    }

    public static void main(String[] args) {
        int sum;

        sum = add1(10, 20);
        System.out.println("add1: " + sum);

        add2(20, 30);

        sum = add3();
        System.out.println("add3: " + sum);

        add4();

        FunctionExample functionExample = new FunctionExample();
        functionExample.func();
    }
}
