import java.util.*;

public class Subset2 {
    public static List<List<Integer>> subset2(int[] nums){
        Arrays.sort(nums);
        List<Integer> output=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();

        helper(nums, 0, output, result);
        return result;
    }

    public static void helper(int[] nums, int i, List<Integer> output, List<List<Integer>> result){
        if(i>=nums.length){
            result.add(new ArrayList<>(output));
            return;
        }
        output.add(nums[i]);
        helper(nums, i+1, output, result);
        output.remove(output.size()-1);
        int id=i+1;
        while(id<nums.length && nums[id]==nums[id-1]){
            id++;
        }
        helper(nums, id, output, result);
    }
    public static void main(String[] args) {
        int[] a={1,2,2,2};
        System.out.println(subset2(a));
    }
    /*
     * TC:O(2^n *n)
     */
}
