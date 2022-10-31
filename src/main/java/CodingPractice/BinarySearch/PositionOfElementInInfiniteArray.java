package CodingPractice.BinarySearch;
// find the index of a target integer in an infinite array
public class PositionOfElementInInfiniteArray {
    public static void main(String[] args) {
        int [] arr = {3,5,7,9,10,90,100,130,140,160,170};
        System.out.println(searchIndex(arr, 160));
    }
    public static int searchIndex(int [] arr, int target){
        int start=0;
        int end=1;
        while (target>arr[end]){
            int newStart=end+1;
            end = end+(end-start+1); //multiply by 2 if you want to increase the search box by 2 times
            start= newStart;
        }
        return binarySearch(arr,target,start,end);
    }
    public static int binarySearch(int [] arr, int target, int start, int end){

        while (start<=end){
            int middle = start+(end-start)/2;
            if (target>arr[middle]){
                start=middle+1;
            }
            else if(target<arr[middle]){
                end=middle-1;
            }
            else {
                return middle;
            }
        }
        return -1;
    }
}
