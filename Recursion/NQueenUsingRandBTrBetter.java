import java.util.*;

public class NQueenUsingRandBTrBetter
{
    public static void generateCombination(int col , List<List<String>> solveNQueens , char[][] board , int n){
        //base case : 
        if(col==n){
            List<String> newAdd = new ArrayList<>();
            for(char[] row : board){
                newAdd.add(new String(row));
            }
            solveNQueens.add(newAdd);    
            return;
        }
        
        for(int row=0 ; row<n ; row++){
            if(isSafePlace(row,col,board,n)){
                board[row][col] = 'Q';
                generateCombination(col+1,  solveNQueens,board,n);
                board[row][col] = '.';
            }
        }    
    }
    
    public static boolean isSafePlace(int row, int col , char[][] board , int n ){
        //base case 
        int drow = row;
        int dcol = col;
            
        // top diagonal
        while(row>=0 && col>=0){
            if(board[row][col]=='Q') return false;
            row--;
            col--;
        }
        
        row = drow;
        col = dcol;
        //left column
        while(col>=0){
            if(board[row][col] == 'Q') return false;
            col--;
        }
        
        // down diagonal 
        row = drow;
        col = dcol;
        while(row<n && col>=0){
            if(board[row][col] == 'Q') return false;
            row++;
            col--;
        }
        
        return true;
        
    }
    
	public static void main(String[] args) {
	    int n = 4;
        List<List<String>> solveNQueens = new ArrayList<>();
        
        char [][] board = new char[n][n];
        
        for(char[] row : board){
            Arrays.fill(row,'.');
        }
           
        generateCombination(0,solveNQueens , board, n);
        
        System.out.println(solveNQueens);
	}
}