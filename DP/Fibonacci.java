public class Fibonacci{
    public static int fib(int n, int[] dp){
        if(n<2) 
        return n;

        if(dp[n]!=-1) 
        return dp[n];

        return dp[n]=fib(n-1, dp)+fib(n-2,dp);
    }
    public static void main(String[] args) {
        int n=5;
        int[] dp=new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
        System.out.println(fib(n, dp));
    }
}