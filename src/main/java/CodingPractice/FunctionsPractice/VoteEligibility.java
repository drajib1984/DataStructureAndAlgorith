package CodingPractice.FunctionsPractice;

import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of voter: ");
        int age = sc.nextInt();
        checkVoterAge(age);
    }

    public static void checkVoterAge(int age){
        if(age>=18){
            System.out.println("The voter can vote");
        }
        else {
            System.out.println("The voter can NOT vote");
        }
    }
}
