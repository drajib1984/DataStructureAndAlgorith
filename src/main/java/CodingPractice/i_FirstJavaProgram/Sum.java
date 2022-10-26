package CodingPractice.i_FirstJavaProgram;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int i1 = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int i2 = sc.nextInt();
        int sum = i1+i2;
        System.out.println("Sum is "+sum);
    }
}
