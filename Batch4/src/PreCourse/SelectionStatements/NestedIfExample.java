package PreCourse.SelectionStatements;

public class NestedIfExample {
    public static void main(String[] args) {
        int age = 20;
        boolean hasDriversLicense = false;

        if(age >= 18) {
            if(hasDriversLicense) {
                System.out.println("You can drive.");
            }
            else {
                System.out.println("You can't drive.");
            }
        }
        else {
            System.out.println("You are a kid.");
        }
    }
}
