package YouTubeCodingQuestions;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str="The rains have started here";
        String str1="The rains have started here";

        System.out.println(str.length());

        System.out.println(str.charAt(7));

        System.out.println(str.indexOf('s'));

        System.out.println(str.indexOf('s', str.indexOf('s') + 1));

        System.out.println(str.indexOf("hello"));

        System.out.println(str.equalsIgnoreCase(str1));

        String str2 = "    Hello World    ";
        System.out.println(str2.trim());
        System.out.println(str2.replace(" ", ""));

        String str3 = "Hello_World_Learn_Java";
        System.out.println(Arrays.toString(str3.split("_")));

    }
}
