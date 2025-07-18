import java.util.*;

public class NQueenUsingRandBTrOptimized
{
    public static void generateCombination(int row , List<List<String>> ans, Set<Integer> posD, Set<Integer> negD, Set<Integer> cols , char[][] board , int n){
        //base case : 
        if(row==n){
            List<String> newAdd = new ArrayList<>();
            for(char[] r : board){
                newAdd.add(new String(r));
            }
            ans.add(newAdd);    
            return;
        }
        
        for(int col= 0 ; col<n ; col++){
            if(cols.contains(col) || posD.contains(row+col) || negD.contains(row-col)) continue;
            
            board[row][col] = 'Q';
            cols.add(col);
            posD.add(row+col);
            negD.add(row-col);
            
            generateCombination(row+1, ans, posD, negD, cols, board, n);
            
            board[row][col] = '.';
            cols.remove(col);
            posD.remove(row+col);
            negD.remove(row-col);
            
        }
    }
    
    
    
	public static void main(String[] args) {
	    int n = 4;
        List<List<String>> ans = new ArrayList<>();
        
        char [][] board = new char[n][n];
        
        for(char[] row : board){
            Arrays.fill(row,'.');
        }
        
        Set<Integer> posD = new HashSet<>();
        Set<Integer> negD = new HashSet<>();
        Set<Integer> cols = new HashSet<>();
        
        generateCombination(0, ans, posD, negD, cols, board, n);
        
        System.out.println(ans);
	}
}