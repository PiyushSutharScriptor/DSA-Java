
public class NoOfIslandOrConnectedComponent {

    public static void dfs(int row, int col, int[][] grid, boolean[][] visited, int[] drow, int[] dcol){
        int m = grid.length;
        int n = grid[0].length;

        for(int i=0 ; i<4 ; i++){
            int nrow = row+drow[i];
            int ncol = col+dcol[i];

            if(nrow>=0 && ncol>=0 && nrow<m && ncol<n && !visited[nrow][ncol] && grid[nrow][ncol]==1){
                visited[nrow][ncol] = true;
                dfs(nrow, ncol, grid, visited, drow, dcol);
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
                    dfs(i,j,grid,visited,drow,dcol);
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
