package DataStructureAlgorithm.ArraysAndLinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class Array2DPractice {
    public static void main(String[] args) {
        int [][]arr = {{23,4,1},{18,12,3,9},{78,-99,34,56},{18,12}};
        System.out.println(searchElement(arr));
        int[] searchElementIndex = searchElementIndex(arr);
        System.out.println(Arrays.toString(searchElementIndex));
        System.out.println(maxValue(arr));
    }
//search for an element
    public static boolean searchElement(int[][] arr){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to be checked: ");
        int input = scanner.nextInt();
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column <arr[row].length ; column++) {
                if (arr[row][column]==input){
                    return true;
                }
            }
        }
        return false;
    }

//search for an element & return the index
    public static int[] searchElementIndex(int [][] arr){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element: ");
        int input = scanner.nextInt();
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if(arr[row][column]==input){
                    return new int[]{row,column};
                }
            }
        }
        return new int[]{-1,-1};
    }

// get the maximum element from 2d array
    public static int maxValue(int[][] arr){
        int max=Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if(arr[row][column]>max){
                    max=arr[row][column];
                }
            }
        }
        return max;
    }
}
