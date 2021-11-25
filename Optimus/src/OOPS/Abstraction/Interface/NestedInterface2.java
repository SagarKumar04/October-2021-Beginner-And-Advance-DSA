package OOPS.Abstraction.Interface;

interface Three {
    void showValue();

    interface Four {
        void showValue();
    }
}

class ImplementingThree implements Three {
    public void showValue() {
        System.out.println("Inside showValue() method of ImplementingThree class");
    }
}

class ImplementingFour implements Three.Four {
    public void showValue() {
        System.out.println("Inside showValue() method of ImplementingFour class");
    }
}

class ImplementingBoth implements Three, Three.Four {
    public void showValue() {
        System.out.println("Inside showValue() method of ImplementingBoth class");
    }
}

public class NestedInterface2 {
    public static void main(String[] args) {
        ImplementingThree implementingThree = new ImplementingThree();
        implementingThree.showValue();

        ImplementingFour implementingFour = new ImplementingFour();
        implementingFour.showValue();
    }
}
