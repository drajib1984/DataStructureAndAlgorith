package CodingPractice.BinarySearch;

public class SearchInMountainArray {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,4,3,2,1};
        System.out.println(findInMountainArray(arr));
    }
    public static int findInMountainArray(int [] arr) {
        int peak=peakIndexInMountainArray(arr);
        int firstTry=OrderAgnosticBinarySearch(arr,5,0,peak);
        if (firstTry!=-1){
            return firstTry;
        }
        else return OrderAgnosticBinarySearch(arr,5,peak+1,arr.length-1);
    }
    public static int peakIndexInMountainArray(int[]arr){
        int start = 0;
        int end = arr.length-1;

        while (start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else {
                start=mid+1;
            }
        }
        return start;
    }
    public static int OrderAgnosticBinarySearch(int [] arr, int target, int start, int end){
        boolean isAscending = arr[start]<arr[end];
        /*if (arr[start]<arr[end]){
            isAscending=true;
        }*/
        while (start<=end){
            int middle = start+(end-start)/2;
            if(target==arr[middle]){
                return middle;
            }
            if(isAscending){
                if(target>arr[middle]){
                    start=middle+1;
                }
                else {
                    end=middle-1;
                }
            }
            else {
                if(target<arr[middle]){
                    start=middle+1;
                }
                else {
                    end=middle-1;
                }
            }
        }
        return -1;
    }
}
