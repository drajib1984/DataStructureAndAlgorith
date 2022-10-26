package CodingPractice.FunctionsPractice;

import java.util.Scanner;

/* Write a program to print the circumference and area of a circle of radius entered by user by defining
your own method. */
public class AreaAndCircumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        double circleArea = CircleArea(radius);
        System.out.println("The area of the circle is :"+circleArea);

        double circumference = CircleCircumference(radius);
        System.out.println("The circumference of the circle is :"+circumference);
    }

    public static double CircleArea(double radius){
        return Math.PI*radius*radius;
    }
    public static double CircleCircumference(double radius){
        return 2*Math.PI*radius;
    }
}
