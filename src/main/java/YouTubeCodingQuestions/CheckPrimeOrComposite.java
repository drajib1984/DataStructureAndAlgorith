package YouTubeCodingQuestions;

import java.util.Scanner;

public class CheckPrimeOrComposite {
    public static void main(String[] args) {
        checkPrime(3);

    }
    public static void checkPrime(int a){
        int count =0;
        for (int i = 1; i <= a; i++) {
            if (a%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println(a+" is a prime number");
        }
        else {
            System.out.println(a+" is a composite number");
        }
    }
}
