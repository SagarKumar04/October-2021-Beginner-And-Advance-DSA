package OOPS.Abstraction.AbstractClass;

abstract class C {
    abstract void callMe();
    abstract void anotherCallMe();

    void callMeToo() {
        System.out.println("Non-abstract method in abstract class C");
    }
}

abstract class D extends C {
    void callMe() {
        System.out.println("Implementation of callMe() method in class D");
    }
}

class E extends D {
    void anotherCallMe() {
        System.out.println("Implementation of anotherCallMe() method in class E");
    }
}

public class AbstractClassExample2 {
    public static void main(String[] args) {
        E e = new E();
        e.callMe();
        e.callMeToo();
        e.anotherCallMe();
    }
}