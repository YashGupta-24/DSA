import java.util.*;

public class Permutations{
    public static List<List<Integer>> permutation(int[] nums){
        List<List<Integer>> result=new ArrayList<>();
        helper(nums, 0, result);
        return result;
    }

    public static void helper(int[] nums, int index, List<List<Integer>> result){
        if(index==nums.length){
            List<Integer> perm = new ArrayList<>();
            for (int num : nums) {
                perm.add(num);
            }
            result.add(perm);
        }
        for(int i=index;i<nums.length;i++){
            int t=nums[index];
            nums[index]=nums[i];
            nums[i]=t;

            helper(nums, index+1, result);

            t=nums[index];
            nums[index]=nums[i];
            nums[i]=t;
        }
    }
    
    public static void main(String[] args) {
        int[] a={1,2,3};
        System.out.println(permutation(a));
    }
    /*
     * TC:O(n!*n)
     * SC:O(n!)
     */
}