import java.util.*;

class Pair{
    int row;
    int col;

    Pair(int row1 , int col1){
        this.row = row1;
        this.col = col1;
    }
}

public class SurrondingRegionsReplaceXwithOUsingBFS {

    public static void convertRegion(char[][] board){
        int m = board.length;
        int n = board[0].length;

        boolean visited[][] = new boolean[m][n];
        Queue<Pair> que = new LinkedList<>();

        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(i==0 || i==m-1){
                    if(board[i][j]=='O'){
                        visited[i][j] = true;
                        que.add(new Pair(i, j));
                    }
	            }
	            else if(j==0 || j==n-1){
                    if(board[i][j]=='O'){
                        visited[i][j] = true;
                        que.add(new Pair(i, j));
                    }
	            }
            }
        }

        int drow[] = {-1,0,1,0};
        int dcol[] = {0,1,0,-1};

        while(!que.isEmpty()){
            Pair p = que.poll();
            int row = p.row;
            int col = p.col;

            for(int i=0 ; i<4 ; i++){
                int nrow = row+drow[i];
                int ncol = col+dcol[i];

                if(nrow>=0 && ncol>=0 && nrow<m && ncol<n && !visited[nrow][ncol] && board[nrow][ncol]=='O'){
                    visited[nrow][ncol] = true;
                    que.add(new Pair(nrow, ncol));
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

