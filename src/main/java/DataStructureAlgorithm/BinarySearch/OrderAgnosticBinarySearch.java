package DataStructureAlgorithm.BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int [] arrAsc= {-18,-12,-4,0,2,3,4,15,16,18,22,45,98};
        int [] arrDesc={99,80,75,22,11,5,2,-3};
        System.out.println(OrderAgnosticBinarySearch(arrAsc, -9));
        System.out.println(OrderAgnosticBinarySearch(arrDesc, 2));
    }

    public static int OrderAgnosticBinarySearch(int [] arr, int target){
        int start=0;
        int end = arr.length-1;
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
