package Functions;

public class StaticNonStaticFunctionExample {
    int nonStaticFunction() {
        return 1;
    }

    static float staticFunction() {
        return 1.5f;
    }

    public static void main(String[] args) {
        StaticNonStaticFunctionExample s = new StaticNonStaticFunctionExample();

        System.out.println("Static: " + staticFunction());
        System.out.println("Non Static: " + s.nonStaticFunction());
    }
}
