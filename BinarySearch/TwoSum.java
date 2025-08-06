import java.util.*;
public class TwoSum {
    public static int[] twoSum(int[] nums, int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target)
                return new int[]{i,j};
            }
        }
        return new int[]{0,0};
    }

    public static int[] twoSum2(int[] nums, int target){
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], i);
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]>target) break;
            int sub=target-nums[i];
            if(map.containsKey(sub))
            return new int[] {map.get(nums[i]), map.get(sub)};
        }
        return new int[]{0,0};
    }
    public static void main(String[] args) {
        int[] nums={3,2,4};
        int target=6;
        System.out.println(Arrays.toString(twoSum2(nums, target)));
    }
}
