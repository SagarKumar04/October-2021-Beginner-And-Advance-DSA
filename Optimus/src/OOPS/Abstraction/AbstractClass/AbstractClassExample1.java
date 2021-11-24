package OOPS.Abstraction.AbstractClass;

abstract class A {
    abstract void callMe();

    void callMeToo() {
        System.out.println("Non-abstract method in abstract class A");
    }
}

class B extends A {
    void callMe() {
        System.out.println("Implementation of callMe() method in class B");
    }
}

public class AbstractClassExample1 {
    public static void main(String[] args) {
        B b = new B();
        b.callMe();
        b.callMeToo();

        System.out.println("----------------");

        A a;
        a = b;
        a.callMe();
        a.callMeToo();
    }
}
