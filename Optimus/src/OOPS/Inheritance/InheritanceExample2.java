package OOPS.Inheritance;

class C {
    int i;
    private int j;

    void setJ() {
        j = 10000;
    }

    int getJ() {
        return j;
    }

    void showIj() {
        System.out.println("i: " + i + ", j: " + j);
    }
}

class D extends C {
    int k;

    void showK() {
        System.out.println("k: " + k);
    }

    void sum() {
        C c = new C();
        c.setJ();
        int j = c.getJ();
        int sum = i + j + k;
        System.out.println("Sum: " + sum);
    }
}

public class InheritanceExample2 {
    public static void main(String[] args) {
        D d = new D();
        d.i = 1111;
        d.k = 2222;

        d.showIj();
        d.showK();
        d.sum();
    }
}
