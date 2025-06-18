//Prefix Sum Algorithm
// Time Complexity: O(1) for range sum query, O(n) for preprocessing
// Space Complexity: O(n) for storing prefix sums
public class StaticRangeSum {
    public static int rangeSum(int arr[], int start, int end) {
        if(start==0)
        return arr[end];
        return arr[end] - arr[start-1];
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for(int i=1; i<arr.length; i++) {
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        System.out.println("Range sum from index 1 to 3: " + rangeSum(prefixSum, 1, 3));
        System.out.println("Range sum from index 0 to 4: " + rangeSum(prefixSum, 0, 4));
        System.out.println("Range sum from index 2 to 2: " + rangeSum(prefixSum, 2, 2));
        System.out.println("Range sum from index 0 to 0: " + rangeSum(prefixSum, 0, 0));
    }
}
