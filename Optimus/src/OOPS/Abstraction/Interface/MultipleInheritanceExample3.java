package OOPS.Abstraction.Interface;

//Solution of Diamond Problem
interface O {
    default void show() {
        System.out.println("In show() method in interface O");
    }
}

interface P {
    default void show() {
        System.out.println("In show() method in interface P");
    }
}

class Q implements O, P {
    public void show() {
        O.super.show();
        P.super.show();
    }
}

public class MultipleInheritanceExample3 {
    public static void main(String[] args) {
        Q q = new Q();
        q.show();
    }
}
