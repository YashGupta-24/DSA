import java.util.ArrayList;

public class KSubArrayMax {
    public static ArrayList<Integer> kSubArrayMax(int[] nums, int k){
        ArrayList<Integer> result=new ArrayList<>();
        int m=Integer.MIN_VALUE;
        int l=0;
        for(int r=0;r<nums.length;r++){
            m=Math.max(m, nums[r]);
            if((r-l+1)>k){
                if(nums[l]==m){
                    r=l+1;
                    m=nums[r];
                }
                l++;
            }
            if((r-l+1)==k){
                result.add(m);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        ArrayList<Integer> result = kSubArrayMax(nums, k);
        System.out.println("Maximums of subarrays of size " + k + ": " + result); // Output: [3, 3, 5, 6, 7]
    }
}
