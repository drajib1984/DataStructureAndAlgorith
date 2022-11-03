package DataStructureAlgorithm.BasicPractices;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
/*Write a program to print whether a number is even or odd, also take input from the user.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int input = scanner.nextInt();
        if (input%2==0){
            System.out.println(input+" is even number");
        }
        else {
            System.out.println(input+" is odd number");
        }

/* Take name as input and print a greeting message for that particular name.*/
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = scanner1.nextLine();
        System.out.println("Good morning!! "+name);

/*Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.*/
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = scanner2.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double interest = scanner2.nextDouble();
        System.out.print("Enter the time: ");
        double time = scanner2.nextDouble();
        double simpleInterest=(principal*interest*time)/100;
        System.out.println("Simple Interest is "+simpleInterest);

/*Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)*/
        Scanner scanner3 = new Scanner(System.in);
        int result=0;
        while (true){
            System.out.print("Enter an operator: ");
            char operator = scanner3.next().trim().charAt(0);
            System.out.print("Enter the 1st number: ");
            int firstNum = scanner3.nextInt();
            System.out.print("Enter the 2nd number: ");
            int secondNum = scanner3.nextInt();
            if (operator=='+'){
                result=firstNum+secondNum;
            }
            if (operator=='-'){
                result=firstNum-secondNum;
            }
            if (operator=='*'){
                result=firstNum*secondNum;
            }
            if (operator=='/'){
                if (secondNum!=0){
                    result=firstNum/secondNum;
                }
            }
            if (operator=='%'){
                result=firstNum%secondNum;
            }
            else if (operator=='x' || operator=='X') {
                System.out.println("Program is closed");
                break;
            }
            else {
                System.out.println("Invalid operation!!");
            }
            System.out.println("The result is "+result);
        }

/*Take 2 numbers as input and print the largest number.*/

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int firstNum = scanner4.nextInt();
        System.out.println("Enter the 2nd number: ");
        int secondNum = scanner4.nextInt();
        if(firstNum>secondNum){
            System.out.println(firstNum+" is larger");
        }
        else {
            System.out.println(secondNum+" is larger");
        }

/*To calculate Fibonacci Series up to n numbers.*/
/* 0,1,1,2,3,5,8,13,21,34*/

        int num1=0;
        int num2=1;
        int sum = 0;
        System.out.print(num1+" "+num2);
        for (int i = 2;i<=10;i++){
            sum=num1+num2;
            System.out.print(" "+sum);
            num1=num2;
            num2=sum;
        }
/*To find out whether the given String is Palindrome or not.*/
        Scanner scanner5= new Scanner(System.in);
        System.out.println("Enter the string: ");
        String check_palindrome = scanner5.next();
        String reverse_palindrome="";
        for (int i=check_palindrome.length()-1;i>=0;i--){
            reverse_palindrome=reverse_palindrome+check_palindrome.charAt(i);
        }
        if (reverse_palindrome.equals(check_palindrome)){
            System.out.println(check_palindrome+" is a palindrome");
        }
        else {
            System.out.println(check_palindrome+" is not a palindrome");
        }
/*To find Armstrong Number between two given number.*/
        Scanner scanner6 = new Scanner(System.in);
        System.out.println("Enter an number to check if armstorng: ");
        int input1 = scanner6.nextInt();
        int amrstrong_number = input1;
        int armstrong_sum=0;
        while (amrstrong_number>0){
            int remainder =amrstrong_number%10;
            int remainder_cube=remainder*remainder*remainder;
            armstrong_sum=armstrong_sum+remainder_cube;
            amrstrong_number=amrstrong_number/10;
        }
        if (armstrong_sum==input1){
            System.out.println("the number is an Armstrong number");
        }
        else {
            System.out.println("the number is not an Armstrong number");
        }

    }
}
