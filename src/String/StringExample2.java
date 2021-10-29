package String;

public class StringExample2 {
    public static void main(String[] args) {
        String str = "Java is a programming language.";

        //counts the number of characters in a string
        int length = str.length();
        System.out.println("Length: " + length);

        /*
        concatenation:
        String + String -> String
        Example: "Java" + "Program" -> "JavaProgram"

        String + Other Data Type -> String
        Example: "Java" + 5 -> "Java5"

        Example: "Java" + 2 + 2 ->
         */
        String result1 = "Java" + 2 + 2;
        /*
        "Java" + 2 + 2 -> "Java2" + 2 -> "Java22"
         */
        System.out.println("Result: " + result1);

        String result2 = "Java" + (2 + 2);
        /*
        "Java" + (2 + 2) -> "Java" + 4 -> "Java4"
         */
        System.out.println("Result: " + result2);
    }
}