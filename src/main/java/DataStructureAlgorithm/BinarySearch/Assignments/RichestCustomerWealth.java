package DataStructureAlgorithm.BinarySearch.Assignments;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3,4},{3,2,1,2}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int answer = Integer.MIN_VALUE;
        for (int customer = 0; customer < accounts.length; customer++) {
            int sum=0;
            for (int account = 0; account < accounts[customer].length; account++) {
                sum= sum+accounts[customer][account];
            }
            if (sum>answer){
                answer=sum;
            }
        }
        return answer;
    }
}
