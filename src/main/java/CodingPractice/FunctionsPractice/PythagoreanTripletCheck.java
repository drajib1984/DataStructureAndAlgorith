package CodingPractice.FunctionsPractice;

import java.util.Scanner;

/* Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is
when the sum of the square of two numbers is equal to the square of the third number).
e.g 3,4,5 */
public class PythagoreanTripletCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int i1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int i2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int i3 = sc.nextInt();

        checkPythagorean(i1,i2,i3);

    }

    public static void checkPythagorean(int a, int b, int c){
        if((a*a)+(b*b)==(c*c)||(a*a)==(b*b)+(c*c)||(a*a)+(c*c)==(b*b) ){
            System.out.println(a+","+b+","+c+" are Pythagorean triplet ");
        }
        else {
            System.out.println(a+","+b+","+c+" are not Pythagorean triplet ");
        }
    }
}
