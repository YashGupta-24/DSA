// package Recursion;
//Backtracking Method to eliminate duplicates
import java.util.*;

public class Subsequence2 {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> set=new ArrayList<>();
        List<Integer> op=new ArrayList<>();
        helper(nums, 0, set, op);
        return set;
    }
    public static void helper(int[] nums, int i, List<List<Integer>> set, List<Integer> output){
        if(i>=nums.length){
            set.add(new ArrayList<>(output));
            return;
        }
        output.add(nums[i]);
        helper(nums, i+1, set, output);
        output.remove(output.size()-1);
        int idx=i+1;
        while(idx<nums.length && nums[idx]==nums[idx-1])
        idx++;
        helper(nums, idx, set, output);
    }

    public static void main(String[] args) {
        int[] nums={1,2,2};
        List<List<Integer>> r= new ArrayList<>();
        r=subsetsWithDup(nums);
        for(int i=0;i<r.size();i++){
            System.out.println(r.get(i));
        }
    }
}
