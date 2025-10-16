
import java.util.*;

public class ArticulationPointIngraph {
    public static int t = 1;

    public static void dfs(int node, int parent, List<List<Integer>> li, boolean[] vis, int[] low, int[] time, List<Integer> res){
        vis[node] = true;
        low[node] = time[node] = t;

        t++;

        for(int el : li.get(node)){
            if(el==parent) continue;

            if(!vis[el]){
                dfs(el, node, li, vis, low, time, res);
                low[node] = Math.min(low[node],low[el]);

                if(low[el]>=time[node] && parent!=-1){
                    res.add(node);
                }
            }
            else{
                low[node] = Math.min(low[node],time[el]);
            }
        }       
        //for 0th node
        if(parent==-1 && t>1){
            res.add(node);
        }
    }

    public static List<Integer> findComp(int[][] edges, int v){
        List<List<Integer>> li = new ArrayList<>();
        
        for(int i=0 ; i<v ; i++){
            li.add(new ArrayList<>());
        }
        
        for(int i=0 ; i<v ; i++){
            for(int el : edges[i]){
                li.get(i).add(el);
            }
        }

        List<Integer> res = new ArrayList<>();
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
        int[][] adj={{1,2,3}, {0}, {0,3,4,5}, {2,0}, {2,6}, {2,6}, {4,5}};
        int v = 7;

        List<Integer> res = findComp(adj,v);
        System.out.println(res);
    }
}
