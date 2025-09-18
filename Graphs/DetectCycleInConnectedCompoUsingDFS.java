import java.util.*;

public class DetectCycleInConnectedCompoUsingDFS {

    public static boolean findCyDfs(int[][] edges, int v){
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

        for(int i=1 ; i<=v ; i++){
            if(!visited[i]){
                if(dfs(i,-1,li,visited)){
                    return true;
                }
            }
        }

        return false;

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
        int[][] edges = {
            {1,2},{2,3},{3,1},   // component 1 → cycle (1-2-3-1)
            {4,5},{5,6}          // component 2 → chain (no cycle)
        };
        int v = 6;

        System.out.println(findCyDfs(edges,v));
    }
}
