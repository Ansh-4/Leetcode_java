import java.util.ArrayList;
import java.util.Arrays;

class Solution{
    public List<List<String>> solveNQueens(int  n){
        char[][] board = new char[n][n];
        for(int i = 0; i<board.length; i++){
            Arrays.fill(board[i], '.');
        }
        List<List<String>> res =  new ArrayList<>();
        backtrack(0, board, res);
        return res;
    }
    private void backtrack(int row, char[][]board, List<List<String>>res){
        if(row==board.length){
            List<String> sol = new ArrayList<>();
            for(char[] r: sol){
                sol.add(new String(r));
            }
            res.add(sol);
            return;
        }
        for(int col = 0; col<board.length; col++ ){
            if(isSafe(row, col, board)){
                board[row][col]= 'Q';
                backtrack(row+1,board,res);
                board[row][col] = '.'; //reset for the next row
            }
        }

    }
    private boolean isSafe(int row, int col, char[][] board){
        for(int i = 0; i<row; i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for(int i = row -1, j = col -1; i>=0 && j>=0; i--,j--){
            if(board[row][col]=='Q'){
                return false;
            }
        }
        for(int i = row -1, j = col + 1; i>=0 && j<board.length; i--, j++){
            if(board[row][col]=='Q'){
                return false;
            }
        }
        return true;
    }
}