// package Recursion;

import java.util.*;

public class Permutations2 {
    public static ArrayList<ArrayList<Integer>> arrayPermutation(int[] nums){
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        ArrayList<Integer> output=new ArrayList<>();
        boolean[] freq=new boolean[nums.length];
        Arrays.sort(nums);
        arrayHelper(nums, result, output, freq);
        return result;
    }

    public static void arrayHelper(int[] nums, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> output, boolean[] freq){
        if(output.size()==nums.length){
            result.add(new ArrayList<>(output));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(freq[i] || (i>0 && nums[i]==nums[i-1] && !freq[i-1])) continue;
            freq[i]=true;
            output.add(nums[i]);
            arrayHelper(nums, result, output, freq);
            output.remove(output.size()-1);
            freq[i]=false;
        }
    }
    public static void main(String[] args) {
        int[] nums={1,1,2};
        ArrayList<ArrayList<Integer>> r=arrayPermutation(nums);
        System.out.println(r);
    }
}
