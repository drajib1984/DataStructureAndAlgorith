package CodingPractice.LoopPractice;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
/*Area Of Circle Java Program*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double pi = Math.PI;
        double area = pi*radius*radius;
        System.out.println("The area of the circle is: "+area);

/*Area Of Triangle*/
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter the base of triangle: ");
        double base = scanner1.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner1.nextDouble();
        double area_triangle=(base*height)/2;
        System.out.println("The area of the circle is: "+area_triangle);

/*Area Of Rectangle Program*/
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter the length of rectangle: ");
        double length = scanner2.nextDouble();
        System.out.print("Enter the breadth of rectangle: ");
        double breadth = scanner2.nextDouble();
        double area_rectangle=length*breadth;
        System.out.println("The area of the rectangle is: "+area_rectangle);

/* Fibonacci Series In Java Programs* --> 0 1 1 2 3 5 8 13 21 34 55*/
        int num1=0;
        int num2=1;
        System.out.print(num1+" "+num2);
        for (int i =2;i<=10;i++){
            int sum = num1+num2;
            System.out.print(" "+sum);
            num1=num2;
            num2=sum;
        }
/*Subtract the Product and Sum of Digits of an Integer*/
        Scanner scanner3= new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int input = scanner3.nextInt();
        int sum=0;
        int product=1;
        while (input>0){
            int rem = input%10;
            sum=sum+rem;
            product=product*rem;
            input=input/10;
        }
        System.out.println("The required result is "+(product-sum));

/*Input a number and print all the factors of that number (use loops).*/
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Input an integer: ");
        int factor = scanner4.nextInt();
        for (int i=1;i<=factor;i++){
            if(factor%i==0){
                System.out.println("The factors of "+factor+" are: "+i);
            }
        }

/* Take integer inputs till the user enters 0 and print the sum of all numbers*/
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int inputs = scanner5.nextInt();
        int sum_total=0;
        while (inputs!=0) {
            sum_total = sum_total + inputs;
            inputs = scanner5.nextInt();
            if (inputs == 0) {
                break;
            }
        }
        System.out.println("The total sum is "+sum_total);
/*Take integer inputs till the user enters 0 and print the largest number from all.*/
        Scanner scanner6 = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int i = scanner6.nextInt();
        int largest = i;
        while (i!=0){
            i = scanner6.nextInt();
            if (i>largest){
                largest=i;
            }
            if(i==0){
                break;
            }
        }
        System.out.println("The largest number is "+largest);


    }
}
