package OOPS.Abstraction.Interface;

interface A {
    void callMe(int num);
}

class B implements A {
    public void callMe(int num) {
        System.out.println("callMe() method in class B: " + num);
    }

    void callMeToo() {
        System.out.println("callMeToo() method in class B");
    }
}

public class InterfaceExample1 {
    public static void main(String[] args) {
        B b = new B();
        b.callMe(10);
        b.callMeToo();

        A a;
        a = b;
        a.callMe(20);

        /*
        a.callMeToo(); -> not allowed
        Reference of interface cannot be used to access those methods
        which are not part of the interface
         */
    }
}


