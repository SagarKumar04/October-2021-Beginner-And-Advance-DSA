package OOPS.Abstraction.Interface;

interface Constants {
    int NO = 0;
    int YES = 1;
    int MAYBE = 2;
}

class F implements Constants {
    int findProbability() {
        int returnValue;
        int probability = (int)(Math.random() * 100);

        if(probability < 30) {
            returnValue = NO;
        }
        else if(probability < 60) {
            returnValue = MAYBE;
        }
        else {
            returnValue = YES;
        }

        return returnValue;
    }
}

public class InterfaceExample3 {
    public static void main(String[] args) {
        F f = new F();
        int probability = f.findProbability();
        System.out.println("Probability: " + probability);
    }
}
