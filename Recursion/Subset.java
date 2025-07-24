import java.util.*;
public class Subset {
    public static List<List<Integer>> subset(int[] nums){
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
        helper(nums, i+1, output, result);
    }

    public static void main(String[] args) {
        int[] a={1,2,3};
        System.out.println(subset(a));
    }

    /*
     * TC:(2^n *n)
     */
}
