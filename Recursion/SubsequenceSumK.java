import java.util.*;
public class SubsequenceSumK {
    //Print all the subsequence with sum K
    public static void subseqSumK(int[] nums, int k, int i, ArrayList<Integer> output, int sum){
        
        if(i>=nums.length){
            if(sum==k){
                System.out.println(output);            }
            return;
        }

        sum+=nums[i];
        output.add(nums[i]);
        subseqSumK(nums, k, i+1, output, sum);
        sum-=nums[i];
        output.remove(output.size()-1);
        subseqSumK(nums, k, i+1, output, sum);
    }

    //Print only a single subsequence with sum K
    public static boolean sumK(int[] nums, int k, int i, ArrayList<Integer> output, int sum){
        if(sum==k){
            System.out.println(output);
            return true;
        }

        if(i>=nums.length){
            return false;
        }

        sum+=nums[i];
        output.add(nums[i]);
        if(sumK(nums, k, i+1, output, sum)){
            return true;
        }
        sum-=nums[i];
        output.remove(output.size()-1);
        if(sumK(nums, k, i+1, output, sum)){
            return true;
        }
        return false;
    }

    //Doubtful - Not giving correct output
    public static int sumK(int[] nums, int k, int i, int sum){
        if(i>=nums.length){
            if(sum==k) return 1;
            return 0;
        }

        sum+=nums[i];
        int left=sumK(nums, k, i+1, sum);
        sum-=nums[i];
        int right=sumK(nums, k, i+1, sum);

        return left+right;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3};
        ArrayList<Integer> output=new ArrayList<>();
        subseqSumK(nums, 3, 0, output, 0);
        sumK(nums, 3, 0, output, 0);
        System.out.println(sumK(nums, 2, 0, 0));
    }
}
