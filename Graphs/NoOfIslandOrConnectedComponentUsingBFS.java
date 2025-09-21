import java.util.*;

class Pair{
    int row;
    int col;

    Pair(int i, int j){
        this.row = i;
        this.col = j;
    }
}

public class NoOfIslandOrConnectedComponentUsingBFS {

    public static void bfs(int ir, int jc, int[][] grid, boolean[][] visited, int[] drow, int[] dcol){

        int m = grid.length;
        int n = grid[0].length;

        Queue<Pair> que = new LinkedList<>();
        que.add(new Pair(ir, jc));

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
    }

    public static void main(String[] args) {
        int grid[][] = {{0,1,1,0},{0,1,1,0},{0,0,1,0},{0,0,0,0},{1,1,0,1}};

        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];

        int drow[] = {-1,0,1,0};
        int dcol[] = {0,1,0,-1};

        int count = 0;
        
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(!visited[i][j] && grid[i][j]==1){
                    visited[i][j] = true;
                    bfs(i, j, grid, visited, drow, dcol);
                    count++;
                }   
            }
        }

        System.out.println(count);
    }
}

