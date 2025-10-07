import java.util.*;

public class NoOfOpToMakeConnectedNetworkBrute{
    
    public static int findOper(int[][] edges, int v){
        List<List<Integer>> li = new ArrayList<>();
        for(int i=0 ; i<v ; i++){
            li.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            int U = edge[0];
            int V = edge[1];

            li.get(U).add(V);
            li.get(V).add(U);
        }

        boolean[] visited = new boolean[v];

        int sum = 0;
        for(int i=0 ; i<v ; i++){
            if(!visited[i]){
                dfs(li,visited,i);
                sum++;
            }
        }

        return sum-1;
    }

    public static void dfs(List<List<Integer>> li, boolean[] visited, int node){
        visited[node] = true;
        for(int el : li.get(node)){
            if(!visited[el]){
                dfs(li,visited,el);
            }
        }
    }

    public static void main(String[] args) {
        int[][] edges = {{0,1},{0,2},{0,3},{1,2},{2,3},{4,5},{5,6},{7,8}};
        int v = 9;

        int res = findOper(edges,v);
        System.out.println(res);
    }
}
