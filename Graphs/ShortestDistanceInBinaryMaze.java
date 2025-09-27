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

public class ShortestDistanceInBinaryMaze {

    public static int findDist(int[][] grid, int[] src, int[] dest){

        int m = grid.length;
        int n = grid[0].length;

        int[][] adj = new int[m][n];
        for(int[] edge : adj){
            Arrays.fill(edge,Integer.MAX_VALUE);
        }
        
        adj[src[0]][src[1]] = 0;

        int[] drow = {-1,0,1,0};
        int[] dcol = {0,1,0,-1};

        Queue<Pair> que = new LinkedList<>();
        que.add(new Pair(0,src[0],src[1]));

        while(!que.isEmpty()){
            Pair p = que.poll();
            int r = p.row;
            int c = p.col;
            int d = p.dist;

            for(int i=0 ; i<4; i++){
                int nrow = r+drow[i];
                int ncol = c+dcol[i];

                if(nrow>=0 && ncol>=0 && nrow<m && ncol<n && grid[nrow][ncol]!=0){
                    if(adj[nrow][ncol]>grid[nrow][ncol]+d){
                        adj[nrow][ncol] = grid[nrow][ncol]+d;
                        que.add(new Pair(grid[nrow][ncol]+d, nrow, ncol));
                    }
                    if(nrow==dest[0] && ncol==dest[1]){
                        return adj[nrow][ncol];
                    }
                }
            }
        }
        
        return -1;

    }

    public static void main(String[] args) {
        int grid[][] = {
            {1,1,1,1},{1,1,0,1},{1,1,1,1},{1,1,0,0},{1,0,0,0}
        };

        int src[] = {0,1};
        int dest[] = {2,2};

        int res = findDist(grid, src, dest);

        System.out.println(res);
    }
}
