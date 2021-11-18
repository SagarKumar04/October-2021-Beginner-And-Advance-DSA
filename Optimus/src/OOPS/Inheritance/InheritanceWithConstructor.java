package OOPS.Inheritance;

class Box {
    private double width;
    private double height;
    private double depth;

    Box() {
        width = height = depth = -1;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box(double dimension) {
        width = height = depth = dimension;
    }

    double volume() {
        double v = width * height * depth;

        return v;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight(double m) {
        super(m);
        weight = m;
    }
}

public class InheritanceWithConstructor {
    public static void main(String[] args) {
        BoxWeight boxWeight1 = new BoxWeight();
        System.out.println("Volume of boxWeight1: " + boxWeight1.volume());
        System.out.println("boxWeight1.weight: " + boxWeight1.weight);

        BoxWeight boxWeight2 = new BoxWeight(10.58);
        System.out.println("Volume of boxWeight2: " + boxWeight2.volume());
        System.out.println("boxWeight2.weight: " + boxWeight2.weight);

        BoxWeight boxWeight3 = new BoxWeight(10.58, 11, 85, 95);
        System.out.println("Volume of boxWeight3: " + boxWeight3.volume());
        System.out.println("boxWeight3.weight: " + boxWeight3.weight);
    }
}
