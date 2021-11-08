package RevisionSessionNov8;

public class StringExample {
    public static void main(String[] args) {
        //replace()
        String str1 = "     Java is an is amazing programming is language.   ";
        String str2 = str1.replace('a', '@');



        System.out.println("str2: " + str2);

        //replaceAll()
        String str3 = str1.replaceAll("is", "*****");
        System.out.println("str3: " + str3);

        //trim()
        String str4 = str1.trim();
        System.out.println("str1: " + str1);
        System.out.println("str4: " + str4);

        //substring()
        String str5 = str1.substring(10);
        System.out.println("str5: " + str5);
        String str6 = str1.substring(10, 18);
        System.out.println("str6: " + str6);

        /*
        string buffer and string builder

        string buffer - thread safe
        string builder - not thread safe
         */
    }
}
