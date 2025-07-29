import java.util.*;
public class CombinationalSum{
    static HashSet<List<Integer>> set=new HashSet<>();
    public static List<List<Integer>> combinationalSum(int[] nums, int target){
        List<Integer> output=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        helper(nums, target, 0, output, result);
        return result;
        
    }
    public static void helper(int[] nums, int target, int index, List<Integer> output, List<List<Integer>> result){
        if(target==0){
            List<Integer> temp=new ArrayList<>(output);
            if(!set.contains(temp)){
                result.add(temp);
                set.add(temp);
            }
            return;
        }
        if(index>=nums.length || target<0){
            return;
        }
        output.add(nums[index]);
        helper(nums, target-nums[index], index+1, output, result);
        helper(nums, target-nums[index], index, output, result);
        output.remove(output.size()-1);
        helper(nums, target, index+1, output, result);
    }

    public static void main(String[] args) {
        int[] a={2,3,5};
        System.out.println(combinationalSum(a, 8));
    }
}