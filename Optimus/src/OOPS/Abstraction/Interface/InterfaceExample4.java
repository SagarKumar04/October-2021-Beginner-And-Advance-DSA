package OOPS.Abstraction.Interface;

interface G {
    void method1();
    void method2();
}

interface H extends G {
    void method3();
}

abstract class I implements H {
    public void method3() {
        System.out.println("In method3()");
    }
}

class J extends I {
    public void method1() {
        System.out.println("In method1()");
    }

    public void method2() {
        System.out.println("In method2()");
    }
}

public class InterfaceExample4 {
    public static void main(String[] args) {
        J j = new J();
        j.method1();
        j.method2();
        j.method3();
    }
}
