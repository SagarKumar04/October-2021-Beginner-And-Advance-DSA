package OOPS.ClassInitializers;

public class StaticInitializer {
    static int numArray[] = new int[10];

    static {
        System.out.println("Inside static block");

        for(int i = 0; i < 10; i++) {
            numArray[i] = (int)(100.0 * Math.random());
        }

        System.out.println("Array initialized");
    }

    void printArray() {
        for(int i = 0; i < 10; i++) {
            System.out.print(numArray[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("First line of main class");

        StaticInitializer staticInitializer = new StaticInitializer();
        System.out.println("Object created");

        staticInitializer.printArray();
        System.out.println("Function called");
    }
}
