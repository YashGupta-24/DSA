
public class HouseRobber{
    public static int helper(int index, int[] nums){
        if(index==0) return nums[index];
        if(index<0) return 0;

        int pick=nums[index]+helper(index-2, nums);
        int notPick=0+helper(index-1, nums);

        return Math.max(pick, notPick);
    }
    public static void main(String[] args) {
        int[] nums={4,1,2,7,5,3,1};
        System.out.println(helper(nums.length-1, nums));
    }
}