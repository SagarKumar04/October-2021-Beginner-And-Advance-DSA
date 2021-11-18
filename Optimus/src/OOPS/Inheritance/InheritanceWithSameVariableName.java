package OOPS.Inheritance;

class E {
    int i;
}

class F extends E {
    int i; //this 'i' hides the 'i' in class E

    F(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}

public class InheritanceWithSameVariableName {
    public static void main(String[] args) {
        F f = new F(1, 2);
        f.show();
    }
}
