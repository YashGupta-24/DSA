public class SortedArray {
    public static boolean isSorted(int[] nums, int i){
        if(i>=nums.length || nums.length==1)
        return true;

        if(nums[i]<nums[i-1]) return false;
        return isSorted(nums, i+1);
    }

    public static void main(String[] args) {
        int[] a={9,12};
        int[] b={8,3};

        System.out.println(isSorted(a, 1));
        System.out.println(isSorted(b, 1));
    }
    /*
     * TC:O(n)
     * SC:O(n)
     */
}
