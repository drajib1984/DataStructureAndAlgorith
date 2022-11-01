package CodingPractice.BinarySearch;
/*ceiling of a number is a number in an array which is equal to the target number or least large of
 target number*/
public class CeilingOfNumber {
    public static void main(String[] args) {
        int [] arr = {1,2,4,9,87,90,458,853,45698};
        System.out.println(CeilingOfNumber(arr, 5));
    }

    public static int CeilingOfNumber(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        if (target>arr[end]){
            return -1;
        }

        while (start<=end){
            int middle = start+(end-start)/2;
            if (target==arr[middle]){
                return middle;
            }
                if(target<arr[middle]){
                    end=middle-1;
                }
                else {
                    start=middle+1;
                }
        }
        return start;
    }
}
