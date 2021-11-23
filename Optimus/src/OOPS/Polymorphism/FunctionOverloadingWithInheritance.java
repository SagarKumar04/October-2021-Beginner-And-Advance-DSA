package OOPS.Polymorphism;

class First {
    void show(int a) {
        System.out.println("show(int): " + a);
    }

    void show(double a) {
        System.out.println("show(double): " + a);
    }
}

class Second extends First {
    void show(double a, float b) {
        System.out.println("show(double, float): " + a + ", " + b);
    }
}

public class FunctionOverloadingWithInheritance {
    public static void main(String[] args) {
        Second second = new Second();
        second.show(5);
        second.show(2.54);
        second.show(10.98, 3.14f);
    }
}
