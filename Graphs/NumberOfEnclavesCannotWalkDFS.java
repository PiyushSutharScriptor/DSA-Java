public class NumberOfEnclavesCannotWalkDFS {

    public static int findEnclave(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];
        int[] drow = {-1,0,1,0};
        int[] dcol = {0,1,0,-1};

        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(i==0 || i==m-1){
                    if(grid[i][j]==1){
                        visited[i][j] = true;
                        dfs(i,j,visited,grid,drow,dcol);
                    }
                }
                else if(j==0 || j==n-1){
                    if(grid[i][j]==1){
                        visited[i][j] = true;
                        dfs(i,j,visited,grid,drow,dcol);
                    }
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

    public static void dfs(int row , int col , boolean[][] visited, int[][] grid, int[] drow, int[] dcol){

        int m = grid.length;
        int n = grid[0].length;

        for(int i=0 ; i<4 ; i++){
            int nrow = row+drow[i];
            int ncol = col+dcol[i];

            if(nrow>=0 && ncol>=0 && nrow<m && ncol<n && !visited[nrow][ncol] && grid[nrow][ncol]==1){
                visited[nrow][ncol] = true;
                dfs(nrow, ncol, visited, grid, drow, dcol);
            }
        }
    }
    public static void main(String[] args) {
        int [][] grid = {{0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}};
        int res = findEnclave(grid);
        System.out.println(res);
    }
}
