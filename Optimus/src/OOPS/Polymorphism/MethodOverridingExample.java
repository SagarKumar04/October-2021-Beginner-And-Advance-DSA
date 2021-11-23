package OOPS.Polymorphism;

class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i: " + i + ", j: " + j);
    }
}

class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        super.show();
        System.out.println("k: " + k);
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        A a = new A(1, 2);
        a.show();

        System.out.println("------------");

        B b = new B(3, 4, 5);
        b.show();
    }
}
