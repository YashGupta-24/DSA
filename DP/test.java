
public class test {

    public static int climbingStairs(int n, int[] dp) {
        if (n < 2) {
            return 1;
        }
        if (dp[n] != -1) {
            return dp[n];
        }

        int left = climbingStairs(n - 1, dp);
        int right = climbingStairs(n - 2, dp);

        dp[n] = left + right;

        return dp[n];
    }

    public static int fibonacci(int n, int[] dp) {
        if (n < 2) {
            return n;
        }
        if (dp[n] != -1) {
            return dp[n];
        }

        int left = fibonacci(n - 1, dp);
        int right = fibonacci(n - 2, dp);

        dp[n] = left + right;

        return dp[n];
    }

    public static int knapsack(int i, int W, int[] weight, int[] value, int[][] dp) {
        if (W == 0) {
            return 0;
        }

        if (i == 0) {
            if (weight[0] <= W) {
                return value[0];
            } else {
                return 0;
            }
        }

        if (dp[i][W] != -1) {
            return dp[i][W];
        }

        int take = 0;
        if (weight[i] <= W) {
            take = value[i] + knapsack(i - 1, W - weight[i], weight, value, dp);
        }

        int skip = knapsack(i - 1, W, weight, value, dp);

        return dp[i][W] = Math.max(take, skip);
    }

    public static boolean subsetSum(int i, int target, int[] arr, Boolean[][] dp) {
        if (target == 0) {
            return true;
        }

        if (i == 0) {
            return arr[0] == target;
        }

        if (dp[i][target] != null) {
            return dp[i][target];
        }

        boolean left = false;
        if (arr[i] <= target) {
            left = subsetSum(i - 1, target - arr[i], arr, dp);
        }

        boolean right = subsetSum(i - 1, target, arr, dp);

        return dp[i][target] = left || right;
    }

    public static boolean canPartition(int[] arr) {
        // Step 1: Check if sum is even
        // Step 2: Call subsetSum(i, target, arr, dp)
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        if(sum%2!=0) return false;
        subsetSum(arr.length-1, sum/2, arr, dp);
    }

}
