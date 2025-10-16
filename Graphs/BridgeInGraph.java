import java.util.*;

public class BridgeInGraph {
    public static int t = 1;

    public static void dfs(int node, int parent, List<List<Integer>> li, boolean[] vis, int[] low, int[] time, List<List<Integer>> res){
        vis[node] = true;
        low[node] = time[node] = t;

        t++;

        for(int el : li.get(node)){
            if(el==parent) continue;

            if(!vis[el]){
                dfs(el, node, li, vis, low, time, res);
                low[node] = Math.min(low[node],low[el]);

                if(low[el]>time[node]){
                    res.add(Arrays.asList(node,el));
                }
            }
            else{
                low[node] = Math.min(low[node],time[el]);
            }
        }
    }

    public static List<List<Integer>> findComp(int[][] edges, int v){
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

        List<List<Integer>> res = new ArrayList<>();
        boolean[] vis = new boolean[v];
        int[] low = new int[v];
        int[] time = new int[v];

        for(int i=0 ; i<v ; i++){
            if(!vis[i]){
                dfs(i,-1,li,vis,low,time,res);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] edges = {{0,1},{1,2},{2,0},{1,3}};
        int v = 4;

        List<List<Integer>> res = findComp(edges,v);
        System.out.println(res);
    }
}
