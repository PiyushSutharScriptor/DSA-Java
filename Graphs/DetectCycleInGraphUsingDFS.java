import java.util.*;

public class DetectCycleInGraphUsingDFS {

    public static boolean findCyDfs(int[][] edges, int v, int k){
        List<List<Integer>> li = new ArrayList<>();

        for(int i=0 ; i<=v ; i++){
            li.add(new ArrayList<>());
        }   

        for(int edge[] : edges){
            int U = edge[0];
            int V = edge[1];

            li.get(U).add(V);
            li.get(V).add(U);
        }

        boolean visited[] = new boolean[v+1];

        return dfs(k,-1,li,visited);

    }

    public static boolean dfs(int node, int parent, List<List<Integer>> li, boolean visited[]){
        visited[node] = true;

        for(int el : li.get(node)){
            if(!visited[el]){
                if(dfs(el, node, li, visited)){
                    return true;
                }
            }
            else if(parent!=el){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] edges = {{1,2},{2,5},{5,7},{7,6},{6,3},{3,1},{3,4}};
        int v = 7;
        int k = 1;

        System.out.println(findCyDfs(edges,v,k));
    }
}
