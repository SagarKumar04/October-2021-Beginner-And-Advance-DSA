package OOPS.ClassInitializers;

public class InstanceInitializer {
    int test;

    {
        System.out.println("In instance initializer");
        test = 10;
    }

    InstanceInitializer() {
        System.out.println("In constructor");
        test = 100;
    }

    public static void main(String[] args) {
        System.out.println("In main()");
        InstanceInitializer instanceInitializer = new InstanceInitializer();
        System.out.println("test: " + instanceInitializer.test);
    }
}
