package OOPS.Abstraction.Interface;

interface L {
    void show();
}

interface M {
    void show();
}

class N implements L, M {
    public void show() {
        System.out.println("Inside show() method in class N");
    }
}

public class MultipleInheritanceExample2 {
    public static void main(String[] args) {
        N n = new N();
        n.show();
    }
}
