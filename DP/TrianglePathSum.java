import java.util.List;

public class TrianglePathSum {
    public static int minPath(int i, int j, List<List<Integer>> triangle, int[][] dp){
        if(i==triangle.size()-1) return triangle.get(i).get(j);
        if(dp[i][j]!=-1) return dp[i][j];

        int down=minPath(i+1, j, triangle, dp);
        int diag=minPath(i+1, j+1, triangle, dp);

        return dp[i][j]=triangle.get(i).get(j)+Math.min(down,diag);
    }

}
