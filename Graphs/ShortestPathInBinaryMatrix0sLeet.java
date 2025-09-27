import java.util.*;

class Pair{
    int dist;
    int row;
    int col;

    Pair(int dist1, int row1, int col1){
        this.dist = dist1;
        this.row = row1;
        this.col = col1;
    }
}

public class ShortestPathInBinaryMatrix0sLeet {

    public static int findPath(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;

        if(grid[0][0]==1 || grid[m-1][n-1]==1) return -1;

        int[] drow = {-1,-1,-1,0,1,1,1,0};
        int[] dcol = {-1,0,1,1,1,0,-1,-1};

        Queue<Pair> que = new LinkedList<>();
        que.add(new Pair(1, 0, 0));
        grid[0][0] = 1;

        while(!que.isEmpty()){
            Pair p = que.poll();
            int r = p.row;
            int c = p.col;
            int d = p.dist;

            if(r==m-1 && c==n-1) return d;

            for(int i=0 ; i<8 ; i++){
                int nrow = r+drow[i];
                int ncol = c+dcol[i];

                if(nrow>=0 && ncol>=0 && nrow<m && ncol<n && grid[nrow][ncol]==0){
                    grid[nrow][ncol] = d+1;
                    que.add(new Pair(d+1, nrow, ncol));
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[][] grid = {{0,0,0},{1,1,0},{1,1,0}};

        int res = findPath(grid);
        System.out.println(res);

        //output : 4
    }
}
