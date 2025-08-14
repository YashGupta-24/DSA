
import java.util.Arrays;

public class MinPathSum{
    public static int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        int[][] dp=new int[m][n];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return pathSum(m-1, n-1, grid, dp);
    }

    public static int pathSum(int i, int j, int[][] grid, int[][] dp){
        if(i<0 || j<0) return Integer.MAX_VALUE;
        if(i==0 && j==0) return grid[0][0];

        if(dp[i][j]!=-1) return dp[i][j];

        int right=pathSum(i, j-1, grid, dp);
        int down =pathSum(i-1, j, grid, dp);

        return dp[i][j]=grid[i][j]+Math.min(right,down);
    }
    public static void main(String[] args) {
        int[][] grid={{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(grid));
    }
}