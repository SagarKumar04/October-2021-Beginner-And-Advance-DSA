package OOPS.Constructor;

public class ParametrizedConstructorExample {
    int a, b;

    ParametrizedConstructorExample(int a, int b) {
       this.a = a;
       this.b = b;
    }

    public static void main(String[] args) {
        ParametrizedConstructorExample parametrizedConstructorExample1 = new ParametrizedConstructorExample(1, 101);
        System.out.println("a: " + parametrizedConstructorExample1.a);
        System.out.println("b: " + parametrizedConstructorExample1.b);

        ParametrizedConstructorExample parametrizedConstructorExample2 = new ParametrizedConstructorExample(301, 981);
        System.out.println("a: " + parametrizedConstructorExample2.a);
        System.out.println("b: " + parametrizedConstructorExample2.b);
    }
}
