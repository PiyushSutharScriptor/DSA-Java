import java.util.*;

class Pair{
    public int r;
    public int c;
    public int t;

    Pair(int row, int col, int time){
        this.r = row;
        this.c = col;
        this.t = time;
    }
}

public class RottenOrangeOpt {

    public static int findMinu(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];
        Queue<Pair> que = new LinkedList<>();

        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(grid[i][j]==2){
                    que.add(new Pair(i, j, 0));
                    visited[i][j]=true;
                }
            }
        }

        int drow[] = {-1,0,1,0};
        int dcol[] = {0,1,0,-1};
        int res = 0;

        while(!que.isEmpty()){
            Pair p = que.poll();
            int i = p.r;
            int j = p.c;
            int t = p.t;

            res = Math.max(res,t);

            for(int k=0 ; k<4 ; k++){
                int r = i+drow[k];
                int c = j+dcol[k];
                if(r>=0 && c>=0 && r<m && c<n && grid[r][c]==1 && !visited[r][c]){
                    que.add(new Pair(r, c, t+1));
                    visited[r][c] = true;
                }
            }

        }

        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n; j++){
                if(grid[i][j]==1 && !visited[i][j]){
                    return -1;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] grid = {{2,0,1,1,1,1,1,1,1,1},{1,0,1,0,0,0,0,0,0,1},{1,0,1,0,1,1,1,1,0,1},{1,0,1,0,1,0,0,1,0,1},{1,0,1,0,1,0,0,1,0,1},{1,0,1,0,1,1,0,1,0,1},{1,0,1,0,0,0,0,1,0,1},{1,0,1,1,1,1,1,1,0,1},{1,0,0,0,0,0,0,0,0,1},{1,1,1,1,1,1,1,1,1,1}};

        int res = findMinu(grid);
        System.out.println(res);
    }
}
