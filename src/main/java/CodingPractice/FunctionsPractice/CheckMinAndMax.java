package CodingPractice.FunctionsPractice;

import java.util.Scanner;

/* Define two methods to print the maximum and the minimum number respectively among three numbers entered
by the user. */
public class CheckMinAndMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int i1 = sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        int i2 = sc.nextInt();
        System.out.println("Enter the 3rd number: ");
        int i3 = sc.nextInt();

        int checkMax = checkMax(i1, i2, i3);
        System.out.println("Maximum number is "+checkMax);

        int checkMin = checkMin(i1, i2, i3);
        System.out.println("Minimum number is "+checkMin);

    }

    static int checkMax(int a,int b,int c){
        int largest = 0;
        if(a>b && a>c){
            largest=a;
        }
        if(b>c && b>a){
            largest=b;
        }
        if(c>a && c>b){
            largest=c;
        }
        return largest;
    }

    public static int checkMin(int a, int b,int c){
        int smallest=0;
        if(a<b && a<c){
            smallest=a;
        }
        if(b<c && b<a){
            smallest=b;
        }
        if(c<a && c<b){
            smallest=c;
        }
        return smallest;
    }
}
