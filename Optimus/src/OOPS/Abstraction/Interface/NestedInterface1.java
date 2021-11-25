package OOPS.Abstraction.Interface;

interface One {
    void showOne();

    interface Two {
        void showTwo();
    }
}

class ImplementingOne implements One {
    public void showOne() {
        System.out.println("Inside showOne() method");
    }
}

class ImplementingTwo implements One.Two {
    public void showTwo() {
        System.out.println("Inside showTwo() method");
    }
}

public class NestedInterface1 {
    public static void main(String[] args) {
        ImplementingOne implementingOne = new ImplementingOne();
        implementingOne.showOne();

        ImplementingTwo implementingTwo = new ImplementingTwo();
        implementingTwo.showTwo();
    }
}
