package CodingPractice.FunctionsPractice;

import java.util.Scanner;

/* Write a program to print the factorial of a number by defining a method named 'Factorial'. */
public class FactorialProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int input = sc.nextInt();

        int factorial = Factorial(input);
        System.out.println("The factorial for "+input+" is "+factorial);

    }

    public static int Factorial(int a){
        int product=1;
        if (a==0){
            return product;
        }
        for(int i =1;i<=a;i++){
            product=product*i;
        }
        return product;
    }

}
