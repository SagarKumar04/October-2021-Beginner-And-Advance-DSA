package PreCourse.SelectionStatements;

public class IfElseLadderExample {
    public static void main(String[] args) {
        int income = 100000;

        if(income <= 250000) {
            System.out.println("You will pay 0% tax.");
        }
        else if(income > 250000 && income <= 500000) {
            System.out.println("You will pay 5% tax.");
        }
        else if(income > 500000 && income <= 1000000) {
            System.out.println("You will pay 10% tax.");
        }
        else if(income > 1000000 && income <= 2000000) {
            System.out.println("You will pay 20% tax.");
        }
        else {
            System.out.println("You will pay 30% tax.");
        }
    }
}
