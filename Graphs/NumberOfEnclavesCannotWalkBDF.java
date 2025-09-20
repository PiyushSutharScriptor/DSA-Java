import java.util.*;

class Pair{
    int row;
    int col;

    Pair(int row1 , int col1){
        this.row = row1;
        this.col = col1;
    }
}

public class NumberOfEnclavesCannotWalkBDF {

    public static int findEnclave(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;

        Queue<Pair> que = new LinkedList<>();

        boolean[][] visited = new boolean[m][n];

        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(i==0 || i==m-1){
                    if(grid[i][j]==1){
                        visited[i][j] = true;
                        que.add(new Pair(i, j));
                    }
                }
                else if(j==0 || j==n-1){
                    if(grid[i][j]==1){
                        visited[i][j] = true;
                        que.add(new Pair(i, j));
                    }
                }
            }
        }

        int[] drow = {-1,0,1,0};
        int[] dcol = {0,1,0,-1};
        
        while(!que.isEmpty()){

            Pair p = que.poll();
            int row = p.row;
            int col = p.col;

            for(int i=0 ; i<4 ; i++){
                int nrow = row+drow[i];
                int ncol = col+dcol[i];

                if(nrow>=0 && ncol>=0 && nrow<m && ncol<n && !visited[nrow][ncol] && grid[nrow][ncol]==1){
                    visited[nrow][ncol] = true;
                    que.add(new Pair(nrow, ncol));
                }
            }
        }

        int count = 0;
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(grid[i][j]==1 && !visited[i][j]){
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int [][] grid = {{0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}};
        int res = findEnclave(grid);
        System.out.println(res);
    }
}
