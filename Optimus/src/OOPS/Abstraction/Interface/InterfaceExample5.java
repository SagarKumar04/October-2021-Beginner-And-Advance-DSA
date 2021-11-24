package OOPS.Abstraction.Interface;

interface AnotherConstants {
    int NO = 0;
    int YES = 1;
    int MAYBE = 2;
}

interface Functions extends AnotherConstants {
    void yes();
    void no();
    void maybe();
}

class K implements Functions {
    public void yes() {
        System.out.println("yes(): " + YES);
    }

    public void no() {
        System.out.println("no(): " + NO);
    }

    public void maybe() {
        System.out.println("maybe(): " + MAYBE);
    }
}

public class InterfaceExample5 {
    public static void main(String[] args) {
        K k = new K();
        k.yes();
        k.no();
        k.maybe();
    }
}
