import java.util.*;

public class NQueens {
    public static void Nqueens(char[][] board, int row){
        if(row==board.length){
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board[i].length;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            return;
        }
        for(int idx=0;idx<board.length;idx++){
            if(isSafe(board, row, idx)){
                board[row][idx]='Q';
                Nqueens(board, row+1);
                board[row][idx]='.';
            }
        }
    }

    public static boolean isSafe(char[][] board, int row, int col){
        int i=0;
        //Row check
        for(i=0;i<board.length;i++){
            if(board[row][i]=='Q')
            return false;
        }

        //Column Check
        for(i=0;i<board.length;i++){
            if(board[i][col]=='Q')
            return false;
        }

        //Left diagonal
        i=row;
        int j=col;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q')
            return false;
            i--;
            j--;
        }

        //Right Diagonal
        i=row;
        j=col;
        while(i>=0 && j<board.length){
            if(board[i][j]=='Q')
            return false;
            i--;
            j++;
        }

        return true;
    }

    public static void main(String[] args) {
        char[][] board=new char[4][4];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                board[i][j]='.';
            }
        }
        Nqueens(board, 0);
    }
}
