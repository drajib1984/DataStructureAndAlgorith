package CodingPractice.FunctionsPractice;

import java.util.Scanner;
/* Write a function that returns the sum of first n natural numbers.*/
public class SumOfNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose sum to be calculated starting from 1: ");
        int i = sc.nextInt();

        int sumofNumbers = sumofNumbers(i);
        System.out.println("The sum of numbers are: "+sumofNumbers);
    }
    public static int sumofNumbers(int a){
        int sum=0;
        for(int i=1;i<=a;i++){
            sum=sum+i;
        }
        return sum;
    }
}
