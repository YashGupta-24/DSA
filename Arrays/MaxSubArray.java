//Kadane's Algorithm
//Time Complexity: O(n)
//Space Complexity: O(1)
public class MaxSubArray {
    public static int maxSubArray(int[] arr){
        if(arr.length==0){
            throw new IllegalArgumentException("Array is empty");
        }
        else if(arr.length==1){
            return arr[0];
        }
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            max=Math.max(max, arr[i]);
            if(sum<0){
                sum=0;
            }
            else{
                maxSum=Math.max(maxSum, sum);
            }
        }
        if(maxSum == Integer.MIN_VALUE) {
            return max; 
        }
        return maxSum;  
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum subarray sum: " + maxSubArray(arr));
        
        int[] singleElementArr = {5};
        System.out.println("Maximum subarray sum: " + maxSubArray(singleElementArr));
        
        int[] allNegativeArr = {-6, -5, -4, -1};
        System.out.println("Maximum subarray sum: " + maxSubArray(allNegativeArr));
        
        int[] mixedArr = {1, -2, 3, 4, -5, 6};
        System.out.println("Maximum subarray sum: " + maxSubArray(mixedArr));
        
        int[] emptyArr = {};
        try {
            System.out.println("Maximum subarray sum: " + maxSubArray(emptyArr));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
