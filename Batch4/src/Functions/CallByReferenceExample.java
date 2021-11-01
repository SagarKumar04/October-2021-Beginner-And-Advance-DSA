package Functions;

public class CallByReferenceExample {
    int a;
    int b;

    static void swap(CallByReferenceExample c) {
        int temp = c.a;
        c.a = c.b;
        c.b = temp;
    }

    public static void main(String[] args) {
        CallByReferenceExample c = new CallByReferenceExample();
        c.a = 10;
        c.b = 20;

        System.out.println("Before calling swap(): ");
        System.out.println("a: " + c.a);
        System.out.println("b: " + c.b);

        swap(c);

        System.out.println("After calling swap(): ");
        System.out.println("a: " + c.a);
        System.out.println("b: " + c.b);
    }
}
