package DataStructureAlgorithm.BinarySearch.BinarySearch2D;

import java.util.Arrays;

public class BinarySearch2DArray {
    public static void main(String[] args) {
        int [][] arr ={
                {10,20,30,40},
                {15,22,37,49},
                {55,57,60,63},
                {67,69,74,88}
        };
        System.out.println(Arrays.toString(searchIndex(arr, 9)));
    }
    public static int[] searchIndex(int [][] arr, int target){
        int row=0;
        int column = arr.length-1;
        while (row< arr.length && column>=0){
            if (arr[row][column]==target){
                return new int[]{row, column};
            }
            if(target>arr[row][column]){
                row++;
            }
            if (target<arr[row][column]){
                column--;
            }
        }
        return new int[]{-1,-1};
    }
}
