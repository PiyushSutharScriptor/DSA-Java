import java.util.*;

class Pair{
    int node;
    int dist;

    Pair(int node1, int dist1){
        this.node = node1;
        this.dist = dist1;
    }
}

public class ShortestPathInDAGusingTopoSortByBFS {
    public static int[] findPath(int[][] grid, int k, int v){
        List<List<Pair>> li = new ArrayList<>();

        for(int i=0 ; i<v ; i++){
            li.add(new ArrayList<>());
        }

        for(int[] edge : grid){
            int U = edge[0];
            int V = edge[1];
            int D = edge[2];

            li.get(U).add(new Pair(V, D));
        }

        //topo sort : 
        boolean[] visited = new boolean[v];
        Stack<Integer> st = new Stack<>();

        for(int i=0 ; i<v ; i++){
            if(!visited[i]){
                dfs(i,visited,li,st);
            }
        }

        int[] res = new int[v];
        Arrays.fill(res,Integer.MAX_VALUE);
        res[k] = 0;

        while(!st.isEmpty()){
            int node = st.pop();
            int d = res[node];

            for(Pair pi : li.get(node)){
                if(res[pi.node]>pi.dist+d){
                    res[pi.node] = pi.dist+d;
                }
            }
        }    

        return res;

    }

    public static void dfs(int element, boolean[] visited, List<List<Pair>> li, Stack<Integer> st ){
        visited[element] = true;

        for(Pair p : li.get(element)){
            if(!visited[p.node]){
                dfs(p.node, visited, li, st);
            }
        }

        st.add(element);
    }
    public static void main(String[] args) {
        int grid[][] = {{0,1,2},{0,4,1},{4,5,4},{4,2,2},{1,2,3},{2,3,6},{5,3,1}};
        int k = 0;
        int v = 7;

        int arr[] = findPath(grid, k, v);

        for(int el : arr){
            if(el!=Integer.MAX_VALUE){
                System.out.print(el + " ");
            }
        }
    }
}
