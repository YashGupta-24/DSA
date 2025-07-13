package Recursion;

import java.util.*;

public class CombinationalSum {
    public static  List<List<Integer>> combinationSum(int[] candidates, int target){
        List<Integer> output=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        boolean[] freq=new boolean[candidates.length];
        Arrays.sort(candidates);
        helper(candidates, 0, 0, target, output, result, freq);
        return result;
    }

    public static void helper(int[] nums, int i, int sum, int t, List<Integer> output, List<List<Integer>> result, boolean[] freq){
        if(sum==t){
            result.add(new ArrayList<>(output));
            return;
        }

        for(int j=i;j<nums.length;j++){
            if((sum+nums[j])>t) return;
            if(j>i && nums[j]==nums[j-1]) continue;
            sum+=nums[j];
            output.add(nums[j]);
            helper(nums, j, sum, t, output, result, freq);
            output.remove(output.size()-1);
            sum-=nums[j];
        }
    }
    public static void main(String[] args) {
        int[] candidates={2,3,6,7};
        int target=7;
        System.out.println(combinationSum(candidates, target));
        int[] candidates2={10,1,2,7,6,1,5};
        int target2=8;
        System.out.println(combinationSum(candidates2, target2));

    }
}
