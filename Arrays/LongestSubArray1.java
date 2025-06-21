public class LongestSubArray1 {
    public static int longestSubArray1(int[] arr){
        int count=0,max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=1){
                max=Math.max(max,count);
                count=0;
            }
            else{
                count++;
            }
        }
        return Math.max(max, count);
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0, 1, 1, 1};
        System.out.println(longestSubArray1(arr)); // Output: 3
    }
}
