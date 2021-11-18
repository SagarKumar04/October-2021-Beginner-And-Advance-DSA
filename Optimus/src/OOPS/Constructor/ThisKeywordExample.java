package OOPS.Constructor;

public class ThisKeywordExample {
    void thisKeywordFunction() {
        System.out.println("Function: " + this);
    }

    public static void main(String[] args) {
        ThisKeywordExample thisKeywordExample1 = new ThisKeywordExample();
        System.out.println("Main: " + thisKeywordExample1);
        thisKeywordExample1.thisKeywordFunction();
        System.out.println();

        ThisKeywordExample thisKeywordExample2 = new ThisKeywordExample();
        System.out.println("Main: " + thisKeywordExample2);
        thisKeywordExample2.thisKeywordFunction();
        System.out.println();

        ThisKeywordExample thisKeywordExample3 = new ThisKeywordExample();
        System.out.println("Main: " + thisKeywordExample3);
        thisKeywordExample3.thisKeywordFunction();
        System.out.println();
    }
}
