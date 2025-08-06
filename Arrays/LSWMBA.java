public class LSWMBA{
    public static int longestSubarray(int[] nums){
        int l=0, count=0, and=0, max=Integer.MIN_VALUE;
        for(int r=0;r<nums.length;r++){
            if(nums[r]>=nums[l]){
                l=r;
            }
            and&=nums[r];
            
        }
    }
}