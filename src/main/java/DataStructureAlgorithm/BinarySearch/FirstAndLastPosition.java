package DataStructureAlgorithm.BinarySearch;

import java.util.Arrays;

/* Given an array of integers nums sorted in non-decreasing order, find the starting and ending position
 of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.*/
public class FirstAndLastPosition {
    public static void main(String[] args) {
        int [] arr = {5,7,7,7,7,8,9,12,34,34,34,38};
        System.out.println(Arrays.toString(searchRange(arr, 7)));
        System.out.println(Arrays.toString(searchRange(arr, 34)));

    }
    public static int[] searchRange(int[] nums, int target) {
        int [] answer = {-1,-1};
        answer[0]=search(nums,target,true);
        answer[1]=search(nums,target,false);

        return answer;
    }
    public static int search(int[] nums, int target, boolean findStartIndex){
        int answer=-1;
        int start = 0;
        int end = nums.length-1;
        while (start<=end){
            int middle = start+(end-start)/2;
            if(target>nums[middle]){
                start=middle+1;
            }
            else if (target<nums[middle]){
                end = middle-1;
            }
            else {
                answer= middle;
                if(findStartIndex==true){
                    end=middle-1;
                    }
                else {
                    start = middle+1;
                }
            }

        }
    return answer;
    }

}
