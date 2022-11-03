package YouTubeCodingQuestions;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        System.out.println(reverseString("Rajib"));
    }

    public static String reverseString(String str){
        String reverse="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse=reverse+str.charAt(i);
        }
        return reverse;
    }
}
