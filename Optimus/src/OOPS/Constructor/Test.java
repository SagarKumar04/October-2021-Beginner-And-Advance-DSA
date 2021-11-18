package OOPS.Constructor;

public class Test {
    void demo() {
        ConstructorExample constructorExample1 = new ConstructorExample();
        System.out.println("a1: " + constructorExample1.a);
        System.out.println("b1: " + constructorExample1.b);

        /*
        ConstructorExample constructorExample4 = new ConstructorExample(-10, (short)-20);
        System.out.println("a4: " + constructorExample4.a);
        System.out.println("b4: " + constructorExample4.b);
         */
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.demo();

        /*
        We don't need to create an object as 'random()' is a static method
        Even if we try to create an object, it won't be allowed as the constructor of Math class is private
         */
        double c = Math.random();
    }
}
