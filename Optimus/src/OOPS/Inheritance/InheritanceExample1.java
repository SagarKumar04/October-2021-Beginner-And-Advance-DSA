package OOPS.Inheritance;

class A {
    int i, j;

    void showIj() {
        System.out.println("i: " + i + ", j: " + j);
    }
}

class B extends A {
    int k;

    void showK() {
        System.out.println("k: " + k);
    }

    void sum() {
        int sum = i + j + k;
        System.out.println("Sum: " + sum);
    }
}

public class InheritanceExample1 {
    public static void main(String[] args) {
        B b = new B();

        b.k = 300;
        b.showIj();
        b.showK();
        b.sum();

        A a = new A();
        a.i = 10;
        a.j = 20;
        a.showIj();

        b.sum();
    }
}
