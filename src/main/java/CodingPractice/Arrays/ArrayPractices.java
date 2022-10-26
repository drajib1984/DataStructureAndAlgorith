package CodingPractice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractices {
    public static void main(String[] args) {
        int [] arr = {4,8,100,7,50,3,23};
        System.out.println(maxValue(arr));
        System.out.println(minValue(arr));
        System.out.println(maxInRange(arr, 4, 6));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(elementExists(arr, 100));
        System.out.println(returnElement(arr));
        swapIndex(arr,1,5);
        System.out.println(Arrays.toString(arr));
        String name="Rajib";
        String name1 = name.toLowerCase();
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(stringSearch(name1));
        System.out.println(searchElementInRange(arr, 3, 6));
    }
// function to find maximum
    public static int maxValue(int [] arr){
        int max=Integer.MIN_VALUE;
        System.out.println(max);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

// function to find minimum
    public static  int minValue(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

// function to find maximum value in range

    public static int maxInRange(int [] arr, int start_index, int last_index){
        int max = Integer.MIN_VALUE;
        for (int i = start_index; i <= last_index; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
// reverse any array
    public static void reverseArray(int[] arr){
        int start=0;
        int last= arr.length-1;
        while (last>start){
        swapIndex(arr,start,last);
        start++;
        last--;
        }
    }
    public static void swapIndex(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
// find if a particular element exists and return index

    public static int elementExists(int [] arr, int target){
        for (int index = 0; index < arr.length; index++) {
            int element=arr[index];
            if (element==target){
                return index;
            }
        }
        return -1;
    }
// find if a particular element exists and return element
    public static boolean returnElement(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to check:");
        int target = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element==target){
                return true;
            }
        }
        return false;
    }

//search a particular element in a range & return true or false

    public static boolean searchElementInRange(int[] arr, int start_index, int last_index){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number to be checked: ");
        int input = scanner.nextInt();
        for (int i = start_index; i <=last_index ; i++) {
            if(arr[i]==input){
                return true;
            }
        }
        return false;
    }

//seach a character in a string & return true or false
    public static boolean stringSearch(String str){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the alphabet: ");
        char c = scanner.nextLine().toLowerCase().trim().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==c){
                return true;
            }
        }
        return false;
    }
}
