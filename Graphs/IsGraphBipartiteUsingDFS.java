public class IsGraphBipartiteUsingDFS {

    public static boolean isBipartite(int[][] graph){
        int n = graph.length;

        int[] visited = new int[n];

        //1 - red
        //-1 - green

        for(int i=0 ; i<n ; i++){
            if(visited[i]==0){
                if(!dfs(i,1,graph,visited)) return false;
            }
        }

        return true;
    }

    public static boolean dfs(int node, int color, int[][] graph, int[] visited){
        visited[node] = color;

        for(int el : graph[node]){
            if(visited[el]==color) return false;
            if(visited[el]==0 && !dfs(el, -color, graph, visited)) return false;
        }

        return true;
    }
    public static void main(String[] args) {
        int[][] graph = {{1,2,3},{0,2},{0,1,3},{0,2}};

        System.out.println(isBipartite(graph));
    }
}
