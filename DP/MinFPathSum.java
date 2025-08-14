
import java.util.Arrays;

public class MinFPathSum {
    public int minFallingPathSum(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;

        int[][] dp=new int[m][n];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return minFalling(0, 0, matrix, dp);
    
    }

    public static int minFalling(int i, int j, int[][]matrix, int[][]dp){
        if(j<0 || j>=matrix[0].length) return Integer.MAX_VALUE;
        if(i==matrix.length-1) return matrix[i][j];
        if(dp[i][j]!=-1) return dp[i][j];

        int down=minFalling(i+1, j, matrix, dp);
        int dl=minFalling(i+1, j-1, matrix, dp);
        int dr=minFalling(i+1, j+1, matrix, dp);

        int min1=Math.min(down,dl);
        int min2=Math.min(min1,dr);
        
        return dp[i][j]=matrix[i][j]+min2;
    }
}
