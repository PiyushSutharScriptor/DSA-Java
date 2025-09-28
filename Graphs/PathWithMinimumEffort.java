import java.util.*;

class Pair{
    int diff;
    int row;
    int col;

    Pair(int diff1, int row1, int col1){
        this.diff = diff1;
        this.row = row1;
        this.col = col1;
    }
}

public class PathWithMinimumEffort {

    public static int findEffort(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;

        int drow[] = {-1,0,1,0};
        int dcol[] = {0,1,0,-1};

        int adj[][] = new int[m][n];
        for(int[] edge : adj){
            Arrays.fill(edge,Integer.MAX_VALUE);
        }
        adj[0][0] = 0;

        PriorityQueue<Pair> que = new PriorityQueue<>((a,b)->a.diff-b.diff);

        que.add(new Pair(0, 0, 0));

        while(!que.isEmpty()){
            Pair p = que.poll();
            int d = p.diff;
            int r = p.row;
            int c = p.col;

            if(r==m-1 && c==n-1) return d;

            for(int i=0 ; i<4 ; i++){
                int nrow = r+drow[i];
                int ncol = c+dcol[i];

                if(nrow>=0 && ncol>=0 && nrow<m && ncol<n){
                    int newDiff = Math.abs(grid[r][c]-grid[nrow][ncol]);
                    int maxDiff = Math.max(newDiff,d);

                    if(adj[nrow][ncol]>maxDiff){ 
                        adj[nrow][ncol] = maxDiff;
                        que.add(new Pair(maxDiff, nrow, ncol));
                    }
                }
            }
        }

        return -1;

    }
    public static void main(String[] args) {
        int grid[][] = {{1,2,2},{3,8,2},{5,3,5}};

        int res = findEffort(grid);

        System.out.println(res);
    }
}
