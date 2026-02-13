import java.util.*;

public class NoOfIslands {

    public static void findIsland(int i, int j, char[][] grid, boolean[][] visited){

        int gr = grid.length;
        int gc = grid[0].length;

        Queue<List<Integer>> que = new LinkedList<>();
        que.add(Arrays.asList(i, j));
        int[] drow = {-1,1,0,0};
        int[] dcol = {0,0,1,-1};

        visited[i][j]=true;

        while(!que.isEmpty()){
            List<Integer> li = que.poll();
            int x = li.get(0);
            int y = li.get(1);

            for(int k=0 ; k<4 ; k++){
                int r = x+drow[k];
                int c = y+dcol[k];

                if(r>=0 && c>=0 && r<gr && c<gc){

                    if(!visited[r][c] && grid[r][c]=='1'){
                        visited[r][c] = true;
                        que.add(Arrays.asList(r, c));
                    }
                }
            }

        }

    }

    public static void main(String[] args) {
        char[][] grid = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};

        int m = grid.length;
        int n = grid[0].length; 

        boolean[][] visited = new boolean[m][n];
        int ans = 0;
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    findIsland(i,j,grid,visited);
                    ans++;
                }
            }
        }

        System.out.println(ans);

    }
}
