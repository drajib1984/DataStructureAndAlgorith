package DataStructureAlgorithm.LoopPractice;

import java.util.Scanner;

public class Intermediate {
    public static void main(String[] args) {
/* Factorial Program In Java.the factorial of a number (n) is defined as a number which is the
product of all the positive numbers which is equal to n starting from 1.*/
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the integer to calculate factorial: ");
        int factorial_number = scanner.nextInt();
        int factorial_product=1;
        for (int i=1;i<=factorial_number;i++){
            factorial_product=factorial_product*i;
        }
        System.out.println("The factorial is "+factorial_product);

/*Calculate Electricity Bill==> 0-99 units=Rs.1.20; 100-199 units=Rs.2.00; above 199=Rs.2.50*/
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the units of electricity consumed: ");
        double consumption = scanner1.nextDouble();
        double bill_amount=0;
        if (consumption<=99){
            bill_amount=consumption*1.20;
        }
        if (consumption>99 ||consumption<=199){
            bill_amount=(99*1.20)+(consumption-99)*2.0;
        }
        if(consumption>199){
            bill_amount=(100*2.0)+(99*1.20)+(consumption-199)*2.5;
        }
        System.out.println("The bill payable is "+bill_amount);

/*Calculate Average Of N Numbers*/
        Scanner scanner2= new Scanner(System.in);
        System.out.println("Enter the number of integers to be put: ");
        int count= scanner2.nextInt();
        int sum=0;
        for (int i=1;i<=count;i++){
            System.out.println("Enter the number");
            int input = scanner2.nextInt();
            sum = sum+input;
        }
        System.out.println("The average is "+(sum/count));

/*Reverse A String In Java & check if palindrome */
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scanner3.next();
        String rev_string="";
        for (int i = string.length()-1;i>=0;i--){
            rev_string=rev_string+string.charAt(i);
        }
        System.out.println("The reverse of the string is "+rev_string);
        if (rev_string.equals(string)){
            System.out.println(string+" is a palindrome");
        }
        else System.out.println(string+" is not a palindrome");

/*Reverse a number In Java & check if palindrome */
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner4.nextInt();
        int number_copy=number;
        int reverse=0;
        while (number>0){
                reverse = reverse*10+number%10;
                number=number/10;
            }
        System.out.println(reverse);
        if (number_copy==reverse){
            System.out.println(number_copy+" is a palindrome");
        }
        else {
            System.out.println(number_copy+" is not a palindrome");
        }


/* Java Program Vowel Or Consonant */
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Enter the letter to checked: ");
        char charAt = scanner5.next().trim().toLowerCase().charAt(0);
        if (charAt == 'a' || charAt == 'e' || charAt == 'i' || charAt == 'o' || charAt == 'u') {
            System.out.println(charAt+" is a vowel");
        }
        else {
            System.out.println(charAt+" is a consonant");
        }

/*Kunal is allowed to go out with his friends only on the even days of a given month.
Write a program to count the number of days he can go out in the month of August. */
        Scanner scanner6= new Scanner(System.in);
        System.out.println("Enter the number of days in the month: ");
        int days = scanner6.nextInt();
        int count_even=0;
        int count_odd=0;
        for (int i=1; i<=days;i++){
            if (i%2==0){
                count_even++;
            }
            else count_odd++;
        }
        System.out.println("The number of even days is: "+count_even);
        System.out.println("The number of odd days is: "+count_odd);

/*Write a program to print the sum of negative numbers, sum of positive even numbers and the
sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates
when the user enters a zero. */

        int entry=0;
        int sum_negative=0;
        int sum_even=0;
        int sum_odd=0;
        while (true){
            Scanner scanner7=new Scanner(System.in);
            System.out.println("Enter the number: ");
            entry = scanner7.nextInt();
            if (entry<0){
                sum_negative=sum_negative+entry;
            }
            if (entry>0 && entry%2==0){
                sum_even=sum_even+entry;
            }
            if (entry>0 && entry%2!=0){
                sum_odd=sum_odd+entry;
            }
            if (entry==0){
                break;
            }
        }
        System.out.println("The sum of negative numbers is: "+sum_negative);
        System.out.println("The sum of positive even numbers is: "+sum_even);
        System.out.println("The sum of positive odd numbers is: "+sum_odd);
    }
}
