public class L26 {
    public static void main(String[] args) {
        int[] nums={-3,-3,-2,-1,-1,0,0,1};

        int l=0;
        int count=1;

        if(nums.length==0){
            System.out.println(0);
        }

        for(int r=0;r<nums.length;r++){
            if(nums[l]!=nums[r]){
                count++;
                l=r;
            }
        }
        System.out.println(count);
    }
}
