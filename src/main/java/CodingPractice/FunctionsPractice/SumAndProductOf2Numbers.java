package CodingPractice.FunctionsPractice;

import java.util.Scanner;

/* Write a program to print the sum & product of two numbers entered by user by defining your own method. */
public class SumAndProductOf2Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int i1 = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int i2 = sc.nextInt();

        int returnSum = returnSum(i1, i2);
        System.out.println("The sum of 2 numbers is: "+returnSum);

        int returnProduct = returnProduct(i1, i2);
        System.out.println("The product of 2 numbers is: "+returnProduct);
    }

    public static int returnSum(int a, int b){
        return a+b;
    }
    public static int returnProduct(int a, int b){
        return a*b;
    }
}
