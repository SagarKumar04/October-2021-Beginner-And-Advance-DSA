package String;

public class StringExample3 {
    public static void main(String[] args) {
        String str = "This is a String.";
        //extracting a character at given index
        char ch = str.charAt(8);
        System.out.println("Character: " + ch);

        int sourceStart = 3;
        int sourceEnd = 9;
        char target[] = new char[10 + sourceEnd - sourceStart];
        int targetStart = 5;
        /*
        extracting characters within the given index range
         */
        str.getChars(sourceStart, sourceEnd, target, targetStart);
        for(int i = 0; i < target.length; i++) {
            System.out.print(target[i]);
        }
        System.out.println();
        String result = new String(target);
        System.out.println("Result: " + result);

        //converts the string to character array
        char strArray[] = str.toCharArray();
        System.out.println("Output:");
        for(int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i]);
        }
        System.out.println();
    }
}
