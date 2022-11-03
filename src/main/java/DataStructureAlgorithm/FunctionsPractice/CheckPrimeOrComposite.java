package DataStructureAlgorithm.FunctionsPractice;

import java.util.Scanner;

/* Define a method to find out if a number is prime or not. */
public class CheckPrimeOrComposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number too be checked: ");
        int i = sc.nextInt();

        checkPrime(i);
    }

    public static void checkPrime(int a){
        int count=0;
        for(int i =1; i<=a;i++){
            if(a%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(a+" is a prime number");
        }
        else {
            System.out.println(a+" is a composite number");
        }
    }
}
