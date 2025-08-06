
import java.util.Arrays;

public class FrogJump {
    public static int minCost(int[] heights){
        int[] dp=new int[heights.length+1];
        Arrays.fill(dp, -1);
        return  helper(heights.length-1, heights, dp);
    }
    public static int helper(int n, int[] heights, int[] dp){
        if(n==0) return 0;

        if(dp[n]!=-1)
        return dp[n];

        int left= helper(n-1, heights,dp)+Math.abs(heights[n]-heights[n-1]);
        int right=Integer.MAX_VALUE;
        if(n>1)
        right=helper(n-2, heights,dp)+Math.abs(heights[n]-heights[n-2]);

        return dp[n]=Math.min(left,right);
    }
}
