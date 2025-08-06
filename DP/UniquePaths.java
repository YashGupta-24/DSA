public class UniquePaths {
    public static int uniquePaths(int i, int j, int[][] dp){
        if(i<0 || j<0) return 0;
        if(i==0 && j==0) return 1;

        if(dp[i][j]!=-1) return dp[i][j];

        int right=uniquePaths(i, j-1, dp);
        int down=uniquePaths(i-1, j, dp);

        return dp[i][j]=right+down;
    }
    public static int uniquePaths2(int i, int j, int[][] dp, int[][] grid){
        if(i<0 || j<0) return 0;
        if(i==0 && j==0){
            if(grid[i][j]==0) return 1;
            return 0;
        }

        if(grid[i][j]==1) return 0;

        if(dp[i][j]!=-1) return dp[i][j];

        int right=uniquePaths2(i, j-1, dp, grid);
        int down=uniquePaths2(i-1, j, dp, grid);

        return dp[i][j]=right+down;
    }


}
