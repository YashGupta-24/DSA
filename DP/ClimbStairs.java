import java.util.*;
public class ClimbStairs {
    public static int climbStairs(int n, int[] dp){
        if(n<=0){
            if(n==0) return 1;
            return 0;
        }
        if(dp[n]!=-1) return dp[n];
        return dp[n]=climbStairs(n-1, dp)+climbStairs(n-2, dp);
    }
    public static void climbStairs(int n){
        int prev1=0,prev2=1,curr=0;

        for(int i=2;i<=n;i++){
            curr=prev1+prev2;
            prev1=prev2;
            prev2=curr;
        }
        System.out.println(curr);
    }
    public static void main(String[] args) {
        int n=5;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(climbStairs(n, dp));
    }
}
