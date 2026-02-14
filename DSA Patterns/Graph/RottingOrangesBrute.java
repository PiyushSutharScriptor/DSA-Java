public class RottingOrangesBrute {

    public static int findMin(int i, int j, int[][] grid){

        int drow[] = {-1,0,1,0};
        int dcol[] = {0,1,0,-1};
        int m = grid.length;
        int n = grid[0].length;

        int count = 0;

        for(int k=0 ; k<4 ; k++){
            int r = i+drow[k];
            int c = j+dcol[k];
            if(r>=0 && c>=0 && r<m && c<n && grid[r][c]==1){
                grid[r][c]=2;
                count++;
            }
        }

        if(count>0) return 1;
        return count;
    }
    public static void main(String[] args) {
        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};

        int m = grid.length;
        int n = grid[0].length;

        int ans = 0;
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(grid[i][j]==2){
                    int count = findMin(i,j,grid);
                    ans+=count;
                }
            }
        }

        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(grid[i][j]==1){
                    ans = -1;
                }
            }
        }

        System.out.println(ans);

    }
}
