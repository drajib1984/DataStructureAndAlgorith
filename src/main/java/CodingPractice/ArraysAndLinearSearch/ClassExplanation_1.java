package CodingPractice.ArraysAndLinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class ClassExplanation_1 {
    public static void main(String[] args) {
        int [] rollNo= new int[10];
        int [] roll ={23,14,58,12,45,1,7,};
        System.out.println(Arrays.toString(roll));
        System.out.println(roll[4]);

        String [] names={"Rajib","Ranjit","Ira","Ananya"};
        System.out.println(Arrays.toString(names));
        System.out.println(names[2]);

// putting primitives into array & print it
        int [] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter numbers: ");
            arr[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

// putting objects into array & print it
        String [] str = new String[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < str.length; i++) {
            System.out.print("Enter a string: ");
            str[i]=scanner.nextLine();
        }
        System.out.println(Arrays.toString(str));

//2D arrays
         int [] [] arr1= new int[3][3]; // column size not mandatory
        int [][] arr2={{1,2,3},{4,5,6},{7,8,9}};
        Scanner scanner1 = new Scanner(System.in);
        for (int row = 0; row < arr1.length ; row++) {
            for (int column = 0; column < arr1[row].length; column++) {
                System.out.print("Enter a number: ");
                arr1[row][column] = scanner1.nextInt();
            }
        }
        for (int row = 0; row < arr1.length; row++) {
            for (int column = 0; column < arr1[row].length; column++) {
                System.out.print(arr1[row][column]+" ");
            }
            System.out.println();
        }
    }
}
