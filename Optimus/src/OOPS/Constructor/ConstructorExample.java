package OOPS.Constructor;

public class ConstructorExample {
    int a, b;

    ConstructorExample() {
        a = 0;
        b = 0;
    }

    ConstructorExample(int a) {
        this.a = a;
    }

    private ConstructorExample(int a, short b) {
        this.a = a;
        this.b = b;
    }

    /*
    ConstructorExample(int a, int b) {
        this.a = a;
        this.b = b;
    }
     */

    public static void main(String[] args) {
        ConstructorExample constructorExample1 = new ConstructorExample();
        System.out.println("a1: " + constructorExample1.a);
        System.out.println("b1: " + constructorExample1.b);

        ConstructorExample constructorExample2 = new ConstructorExample(1000);
        System.out.println("a2: " + constructorExample2.a);
        System.out.println("b2: " + constructorExample2.b);

        /*
        ConstructorExample constructorExample3 = new ConstructorExample(100, 200);
        System.out.println("a3: " + constructorExample3.a);
        System.out.println("b3: " + constructorExample3.b);
         */

        ConstructorExample constructorExample4 = new ConstructorExample(-10, (short)-20);
        System.out.println("a4: " + constructorExample4.a);
        System.out.println("b4: " + constructorExample4.b);

    }
}
