package CodingPractice.FunctionsPractice;

import java.util.Scanner;
/* Define a program to find out whether a given number is even or odd. */
public class CheckEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to be checked: ");
        int input = sc.nextInt();
        checkEvenorOdd(input);
    }

    public static void checkEvenorOdd(int a){
        if(a%2==0){
            System.out.println(a+" is an even number");
        }
        else{
            System.out.println(a+" is an odd number");
        }
    }
}
