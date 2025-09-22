public class CycleDetectInDirectedGraphUsingDFS {

    public static boolean findCyc(int[][] grid){
        int m = grid.length;

        boolean[] visited = new boolean[m];
        boolean[] pathvist = new boolean[m];

        for(int i=1 ; i<m ; i++){
            if(!visited[i]){
                if(dfs(i,visited,pathvist,grid)) return true;
            }
        }
        return false;
    }

    public static boolean dfs(int node, boolean[] visited, boolean[] pathvist, int[][] grid){
        
        visited[node] = true;
        pathvist[node] = true; 

        for(int el : grid[node]){
            if(!visited[el]){
                if(dfs(el, visited, pathvist, grid)) return true;
            }
            else if(pathvist[el]) return true;
        }
        
        pathvist[node] = false;

        return false;
    }

    public static void main(String[] args) {
        int grid[][] = {{},{2},{3},{4,7},{5},{6},{},{5},{9},{10},{8}};
        System.out.println(findCyc(grid));
    }   
}
