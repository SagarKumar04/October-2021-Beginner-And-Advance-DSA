package RevisionSessionNov2;

public class StaticAndNonStaticExample {
    int a;
    static int b;

    public static void main(String[] args) {
        StaticAndNonStaticExample s = new StaticAndNonStaticExample();
        s.a = 10;
        b = 20;

        System.out.println("a: " + s.a);
        System.out.println("b: " + b);
    }
}
