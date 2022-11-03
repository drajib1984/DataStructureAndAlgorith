package YouTubeCodingQuestions;

import java.util.Scanner;

public class Swap2Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the 1st number: ");//10
        int i1 = sc.nextInt();
        System.out.print("Input the 2nd number: ");//20
        int i2 = sc.nextInt();

        i1 = i1-i2;//-10
        i2=i1+i2;//10
        i1=i2-i1;//20
        System.out.println("1st number is: "+i1);
        System.out.println("2nd number is: "+i2);

    }
}
