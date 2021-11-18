package OOPS.Inheritance;

import java.lang.reflect.Constructor;

class I {
    int i;

    private I() {
        System.out.println("Test");
        i = 10;
    }
}

class J {
    int j;

    void getIObject() throws ClassNotFoundException {
        Class<?> g = Class.forName("OOPS.Inheritance.I");
        Constructor<?> arr[] = g.getDeclaredConstructors();
        for(Constructor<?> a : arr) {
            System.out.println("arr: " + a);
        }
    }

    J() {
        //super();
        j = 20;
    }
}

public class ObjectDuringRunTime {
    public static void main(String[] args) throws ClassNotFoundException {
        J j = new J();
        j.getIObject();
    }
}
