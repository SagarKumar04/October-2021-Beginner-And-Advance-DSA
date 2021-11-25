package OOPS.Abstraction.Interface;

interface Car {
    int a = 1000;

    int speed = 120;
    public void distanceTravelled();
}

interface Bus {
    int a = 10000;

    int distance = 100;
    public void speed();
}

class Vehicle implements Car, Bus {
    int distanceTravelled;
    int averageSpeed;

    public void printA() {
        System.out.println("Value of 'a' in 'Bus' interface is: " + Bus.a);
        System.out.println("Value of 'a' in 'Car' interface is: " + Car.a);
    }

    public void distanceTravelled() {
        int time = 5;
        distanceTravelled = speed * time;

        System.out.println("Distance Travelled: " + distanceTravelled);
    }

    public void speed() {
        averageSpeed = distanceTravelled / speed;

        System.out.println("Average Speed: " + averageSpeed);
    }
}

public class MultipleInheritanceExample1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.distanceTravelled();
        vehicle.speed();

        vehicle.printA();
    }
}
