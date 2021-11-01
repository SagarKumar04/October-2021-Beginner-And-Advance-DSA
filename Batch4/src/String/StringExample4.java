package String;

public class StringExample4 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        //compares two strings and tells whether both are equal or not (case-sensitive)
        boolean result12 = str1.equals(str2);
        System.out.println("Result12: " + result12);

        String str3 = "java";
        boolean result13 = str1.equals(str3);
        System.out.println("Result13: " + result13);

        //compares two strings and tells whether both are equal or not (not case-sensitive)
        result13 = str1.equalsIgnoreCase(str3);
        System.out.println("Result13: " + result13);

        String str4 = "That is a cute dog.";
        String str5 = "that ";
        //checks whether the string starts with a given string
        boolean result45 = str4.startsWith(str5);
        System.out.println("Result45: " + result45);

        String str6 = " dog.";
        //checks whether the string ends with a given string
        boolean result46 = str4.endsWith(str6);
        System.out.println("Result46: " + result46);

        result12 = (str1 == str2);
        System.out.println("Result12: " + result12);
        result13 = (str1 == str3);
        System.out.println("Result13: " + result13);

        String str7 = new String(str1);
        System.out.println("str7: " + str7);
        boolean result17 = (str1 == str7);
        System.out.println("Result17: " + result17);

        String str8 = "m vpples";
        String str9 = "apples";
        /*
        compares two strings and gives an integer value depending upon lexicographical ordering
        if the strings are of different length, difference of length is returned as output

        a-z -> 97 to 122
        A-Z -> 65-90
         */
        int compareResult = str8.compareTo(str9);
        System.out.println("compareResult: " + compareResult);
    }
}