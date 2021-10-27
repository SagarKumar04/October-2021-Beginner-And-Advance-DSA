package Functions;

public class StaticAndNonStaticVariableExample {
    int a;
    static int b;

    public static void main(String[] args) {
        StaticAndNonStaticVariableExample s = new StaticAndNonStaticVariableExample();

        b = 1000;
        s.a = 100;

        System.out.println("a: " + s.a);
        System.out.println("b: " + b);
    }
}
