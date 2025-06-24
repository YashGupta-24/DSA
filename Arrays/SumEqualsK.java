import java.util.HashMap;

public class SumEqualsK {
    public static int sumEqualsK(int[] arr, int k) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        
        HashMap<Integer, Integer> map=new HashMap<>();
        int count=0;
        int preSum=0;
        map.put(0, 1); // Initialize with sum 0 to handle cases where subarray starts from index 0
        for(int i=0;i<arr.length;i++){
            preSum+=arr[i];
            int remove=preSum-k;
            count+=map.getOrDefault(remove, 0);
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 5;
        System.out.println("Number of subarrays with sum " + k + ": " + sumEqualsK(arr, k)); // Output: 2
    }
}
