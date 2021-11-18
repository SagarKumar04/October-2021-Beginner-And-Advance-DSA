package OOPS.Constructor;

public class DefaultConstructorExample {
    int a, b;

    DefaultConstructorExample() {
        System.out.println("In the default constructor");
        a = 101;
        b = 202;
    }

    public static void main(String[] args) {
        /*
        ConstructorExample constructorExample = new ConstructorExample();
         */

        /*
        constructorExample.a = 100;
        constructorExample.b = 200;
         */

        DefaultConstructorExample defaultConstructorExample1 = new DefaultConstructorExample();
        System.out.println("a: " + defaultConstructorExample1.a);
        System.out.println("b: " + defaultConstructorExample1.b);

        DefaultConstructorExample defaultConstructorExample2 = new DefaultConstructorExample();
        System.out.println("a: " + defaultConstructorExample2.a);
        System.out.println("b: " + defaultConstructorExample2.b);
    }
}
