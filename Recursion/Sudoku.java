public class Sudoku {
    public static boolean solveSudoku(char[][] board, int row, int col){
        if(row==board.length){
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board[i].length;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            return true;
        }
        int nextRow=row;
        int nextCol=col+1;
        if(board[row][col]!='.'){
            if(col+1==board.length){
                nextRow++;
                nextCol=0;
            }
            return solveSudoku(board, nextRow, nextCol);
        }
        for(char j='1';j<='9';j++){
            if(isSafe(board, row, col, j)){
                board[row][col]=j;
                if(solveSudoku(board, nextRow, nextCol)){
                    return true;
                }
                board[row][col]='.'; 
            }
        }
        return false;
    }

    public static boolean isSafe(char[][] board, int row, int col, char digit){
        for(int i=0;i<board.length;i++){
            if(board[row][i]==digit || board[i][col]==digit)
            return false;
        }

        int sr=(row/3)*3;
        int sc=(col/3)*3;

        for(int i=sr;i<=sr+2;i++){
            for(int j=sc;j<=sc+2;j++){
                if(board[i][j]==digit)
                return false;
            }
        }
        return true;
    }
}