import java.util.*;

public class SudokoSolverOptimizedBool
{
    public static boolean findValid(char[][]board){
        int n = board.length;
        
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                
                if(board[i][j]=='.'){
                    
                    for(char k='1' ; k<='9' ; k++){
                        
                        if(isPossible(board, i, j,k)){
                            board[i][j] = k;
                            
                            if(findValid(board)==true) return true;
                            else board[i][j] = '.';
                            
                        }
                    }
                    
                    return false;
                }
                
            }
            
        }
        
        return true;
    }
    
    public static boolean isPossible(char[][] board, int row, int col , char k){
        for(int p=0 ; p<9 ; p++){
            
            //row condition
            if((board[row][p])==k) return false;
            //col condition
            if((board[p][col])==k) return false;
            //matrix condition
            if(board[3*(row/3)+p/3][3*(col/3)+p%3]==k) return false;
            
        }
        return true;
    }
    
	public static void main(String[] args) {
	   char[][] board = {    {'5','3','.','.','7','.','.','.','.'}
                            ,{'6','.','.','1','9','5','.','.','.'}
                            ,{'.','9','8','.','.','.','.','6','.'}
                            ,{'8','.','.','.','6','.','.','.','3'}
                            ,{'4','.','.','8','.','3','.','.','1'}
                            ,{'7','.','.','.','2','.','.','.','6'}
                            ,{'.','6','.','.','.','.','2','8','.'}
                            ,{'.','.','.','4','1','9','.','.','5'}
                            ,{'.','.','.','.','8','.','.','7','9'}  };
                            
        
        System.out.println(findValid(board));
        
	}
}