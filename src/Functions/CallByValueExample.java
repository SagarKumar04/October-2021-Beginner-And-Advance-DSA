package Functions;

public class CallByValueExample {
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("In swap: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void main(String[] args) {
        int a = 10, b = 30;

        System.out.println("Before calling swap(): ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        swap(a, b);

        System.out.println("After calling swap(): ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}