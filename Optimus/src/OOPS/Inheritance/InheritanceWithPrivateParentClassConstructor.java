package OOPS.Inheritance;

/*
The part of the code which can throw error has been commented, so that
other classes can be compiled
 */

class G {
    int i;

    /*
    private G() {
        System.out.println("Test");
        i = 10;
    }
     */

}

class H extends G {
    int j;

    /*
    H() {
        super(); //error, as 'G()' has private access in 'OOPS.Inheritance.G'
        j = 20;
    }
     */

}

public class InheritanceWithPrivateParentClassConstructor {
    public static void main(String[] args) throws ClassNotFoundException {
        H h = new H();
    }
}
