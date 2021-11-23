package OOPS.Polymorphism;

class Figure {
    double dimension1;
    double dimension2;

    Figure(double a, double b) {
        dimension1 = a;
        dimension2 = b;
    }

    double area() {
        System.out.println("Area of the figure is undefined");
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside area() method of Rectangle class");
        double a = dimension1 * dimension2;

        return a;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside area() method of Triangle class");
        double a = dimension1 * dimension2 / 2;

        return a;
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Figure figure = new Figure(1, 2);
        Rectangle rectangle = new Rectangle(9, 10);
        Triangle triangle = new Triangle(10, 12);

        Figure figureRef;

        figureRef = rectangle;
        System.out.println("Area: " + figureRef.area());

        System.out.println("-----");

        figureRef = triangle;
        System.out.println("Area: " + figureRef.area());

        System.out.println("-----");

        figureRef = figure;
        System.out.println("Area: " + figureRef.area());
    }
}
