package OOPS.Polymorphism;

public class FunctionOverloadingExample {
    static final double PI = 3.1415926;

    //area of a circle -> pi * radius * radius
    void area(double radius) {
        double a = PI * radius * radius;
        //double a = Math.PI * radius * radius;

        System.out.println("Area of the circle with radius " + radius + " is: " + a);
    }

    //area of a square -> side * side
    void area(float side) {
        float a = side * side;

        System.out.println("Area of the square with side " + side + " is: " + a);
    }

    //area of a triangle -> (1 / 2) * base * height
    void area(float base, double height) {
        double a = (1.0 / 2) * base * height;

        System.out.println("Area of the triangle with base " + base + " and height " + height + " is: " + a);
    }

    //area of a rectangle -> length * breadth
    void area(float length, float breadth) {
        float a = length * breadth;

        System.out.println("Area of the rectangle with length " + length + " and breadth " + breadth + " is: " + a);
    }

    public static void main(String[] args) {
        FunctionOverloadingExample foe = new FunctionOverloadingExample();
        foe.area(3.68741); //circle
        foe.area(7.895f); //square
        foe.area(102.54f, 1458.35); //triangle
        foe.area(254.258f, 469.21f);

        foe.area(12);
        /*
        if an overloaded function......
         */
    }
}
