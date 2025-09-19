public class SurrondingRegionsReplaceXwithO {

    public static void convertRegion(char[][] board){
        int m = board.length;
        int n = board[0].length;

        boolean visited[][] = new boolean[m][n];
        int drow[] = {-1,0,1,0};
        int dcol[] = {0,1,0,-1};

        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(i==0 || i==m-1){
                    if(board[i][j]=='O'){
                        visited[i][j] = true;
                        dfs(i,j,visited,board,drow,dcol);
                    }
	            }
	            else if(j==0 || j==n-1){
                    if(board[i][j]=='O'){
                        visited[i][j] = true;
                        dfs(i,j,visited,board,drow,dcol);
                    }
	            }
            }
        }

        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(!visited[i][j]){
                    board[i][j] = 'X';
                }
            }
        }
    }

    public static void dfs(int row, int col, boolean[][] visited, char[][] board, int[] drow, int[] dcol){

        int m = board.length;
        int n = board[0].length;

        for(int i=0 ; i<4 ; i++){
            int nrow = row+drow[i];
            int ncol = col+dcol[i];

            if(nrow>=0 && ncol>=0 && nrow<m && ncol<n && !visited[nrow][ncol] && board[nrow][ncol]=='O'){
                visited[nrow][ncol] = true;
                dfs(nrow, ncol, visited, board, drow, dcol);
            }
        }
    }

    public static void main(String[] args) {
        char board[][] = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};

        convertRegion(board);

        for(int i=0 ; i<board.length ; i++){
            for(int j=0 ; j<board[0].length ; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
