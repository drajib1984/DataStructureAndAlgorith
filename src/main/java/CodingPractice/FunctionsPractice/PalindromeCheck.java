package CodingPractice.FunctionsPractice;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

/* Write functions to find if a number and string is a palindrome or not.  */
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to check palindrome: ");
        int i = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter a string to check palindrome: ");
        String s = scanner1.nextLine();

        checkIntPalindrome(i);

        checkStringPalindrome(s);
    }

    public static void checkIntPalindrome(int a){
        int reverse=0;
        int original=a;
        while (a>0){
            int remainder=a%10;
            reverse=reverse*10+remainder;
            a=a/10;
        }
        if(original==reverse){
            System.out.println(original+" is a palindrome");
        }
        else {
            System.out.println(original+" is not a palindrome");
        }

    }

    public static void checkStringPalindrome(@NotNull String str){
        String reverse="";
        String original=str;
        for (int i = str.length()-1;i>=0;i--){
            reverse=reverse+str.charAt(i);
        }
        if(original.equals(reverse)){
            System.out.println(original+" is a palindrome");
        }
        else {
            System.out.println(original+" is not a palindrome");
        }
    }
}
