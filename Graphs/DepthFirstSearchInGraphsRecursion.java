import java.util.*;

public class DepthFirstSearchInGraphsRecursion{

    public static List<Integer> findDfs(int[][]edges, int v, int k){
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

        boolean visited[] = new boolean[v];
        List<Integer> res = new ArrayList<>();

        dfs(k,li,res,visited);

        return res;
    }

    public static void dfs(int node, List<List<Integer>> li, List<Integer> res, boolean[] visited){
        visited[node] = true;
        res.add(node);

        for(int el : li.get(node)){
            if(!visited[el]){
                dfs(el,li,res,visited);
            }
        }
    }

    public static void main(String[] args) {
        int v = 5;
        int edges[][] = { { 0, 1 }, { 0, 2 }, { 1, 3 }, { 2, 4 } };
        int k = 0;

        List<Integer> res = findDfs(edges,v,k);
        System.out.println(res);
    }
}
