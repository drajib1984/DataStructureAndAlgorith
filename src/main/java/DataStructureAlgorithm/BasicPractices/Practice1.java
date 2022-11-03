package DataStructureAlgorithm.BasicPractices;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

 /* Input a year and find whether it is a leap year or not.
1.If the year is evenly divisible by four, then go to step 2. Otherwise, go to step 5.
2.If the year is evenly divisible by a hundred, then go to step 3. Otherwise, go to step 4.
3.If the year is evenly divisible by four hundred, then go to step 4. Otherwise, you can go to step 5.
4.The year is a leap year (if it has 366 days).
5.The year is not a leap year (if it has 365 days)*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        if (year%4==0 || year%100==0 || year%400==0){
            System.out.println(year+" is a leap year");
        }
        else {
            System.out.println(year+" is not a leap year");
        }


/* Take two numbers and print the sum of both.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2 = scanner.nextInt();
        int sum = num1+num2;
        System.out.println("Sum of "+num1+" & "+num2+" is: "+sum);

/* Take a number as input and print the multiplication table for it.*/
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter the number whose multiplication table too be created: ");
        int multiply = scanner1.nextInt();
        int product=1;
        for (int i=1; i<=10;i++){
            product=multiply*i;
            System.out.println(multiply+"X"+i+"="+product);
        }


/*Take 2 numbers as inputs and find their HCF and LCM.*/
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int first_num = scanner2.nextInt();
        System.out.print("Enter the 2nd number: ");
        int second_num = scanner2.nextInt();
        int hcf = first_num;
        while (true){
            if ((first_num%hcf==0) && (second_num%hcf==0) ){
                break;
            }
            else {
                hcf--;
            }
        }
        System.out.println("HCF of "+first_num+" and "+second_num+" is "+hcf);

        int lcm;
        if (first_num>second_num){
            lcm = first_num;
        }
        else lcm = second_num;
        while (true){
            if((lcm%first_num==0) && (lcm%second_num==0)){
                break;
            }
            else lcm++;
        }
        System.out.println("LCM of "+first_num+" and "+second_num+" is "+lcm);
/* Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.*/

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Input numbers till you want or else enter 'x': ");
        int inputNum = scanner3.nextInt();
        int sum1 =0;
        while (inputNum>0) {
            sum1=sum1+inputNum;
            inputNum = scanner3.nextInt();
            if (inputNum == 0) {
                break;
            }
        }
        System.out.println(sum1);

    }
}
