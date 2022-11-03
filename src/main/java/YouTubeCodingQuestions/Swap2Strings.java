package YouTubeCodingQuestions;

import java.util.Scanner;

public class Swap2Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st string: ");
        String s1 = sc.nextLine();//hello
        System.out.println("Enter the 2nd string: ");
        String s2 = sc.nextLine();//world

        s1 = s1+s2;//helloworld
        s2=s1.substring(0,s1.length()-s2.length());

        s1 = s1.substring(s2.length());

        System.out.println(s1);
        System.out.println(s2);

    }
}
