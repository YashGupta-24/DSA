import java.util.*;
public class RIM {
    public static List<String> ratInMaze(int[][] maze){
        List<String> result=new ArrayList<>();
        String path="";
        helper(maze, 0, 0, path, result);
        return result;
    }
    public static void helper(int[][] maze,int row, int col, String path, List<String> result){
        int n=maze.length;
        if(row<0 || col<0 || row>=n || col>=n || maze[row][col]==-1|| maze[row][col]==0){
            return;
        }

        if(row==n-1 && col==n-1){
            result.add(path);
            return;
        }
        maze[row][col]=-1;
        helper(maze, row+1, col, path+'D', result);
        helper(maze, row-1, col, path+'D', result);
        helper(maze, row, col+1, path+'L', result);
        helper(maze, row, col-1, path+'R', result);
        maze[row][col]=1;
    }
    public static void main(String[] args) {
        
    }
}
