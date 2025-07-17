
public class WordSearchRecursionBetter
{
    public static boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(findWord(board,word,i,j,0,m,n)){
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean findWord(char[][]board, String word, int i, int j, int idx,int m, int n){
        
        //base case
        if(idx==word.length()) return true;

        //boundary case
        if(i<0 || j<0 || i>=m || j>=n || board[i][j]!=word.charAt(idx)) return false;

        char temp = board[i][j];
        board[i][j] = '#';

        //recursion
        Boolean found = findWord(board,word,i+1,j,idx+1,m,n) || 
                        findWord(board,word,i,j+1,idx+1,m,n) || 
                        findWord(board,word,i-1,j,idx+1,m,n) || 
                        findWord(board,word,i,j-1,idx+1,m,n);

        board[i][j] = temp;

        return found;

    }
    
	public static void main(String[] args) {
	    char [][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
	    String word = "ABCCED";
	    
	    System.out.println(exist(board,word));
	}
}