package OOPS.Abstraction.AbstractClass;

abstract class Server {
    String name;

    Server(String name) {
        this.name = name;
    }

    abstract boolean start();
}

class Tomcat extends Server {
    Tomcat(String name) {
        super(name);
    }

    boolean start() {
        System.out.println("Name: " + name);
        System.out.println(name + " started successfully");
        return true;
    }
}

public class AbstractClassExample3 {
    public static void main(String[] args) {
        Tomcat tomcat = new Tomcat("Apache");
        tomcat.start();
    }
}
