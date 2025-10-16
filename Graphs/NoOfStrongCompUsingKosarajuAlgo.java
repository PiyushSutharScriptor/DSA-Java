import java.util.*;

public class NoOfStrongCompUsingKosarajuAlgo {

    public static void sort(int node, int[][] adj, Stack<Integer> st, boolean[] vis){
        vis[node] = true;
        for(int el : adj[node]){
            if(!vis[el]){
                sort(el, adj, st, vis);
            }
        }
        st.push(node);
    }

    public static void connect(int node, List<List<Integer>> adj, boolean[] vis){
        vis[node] = true;
        for(int el : adj.get(node)){
            if(!vis[el]){
                connect(el, adj, vis);
            }
        }
    }

    public static int findStr(int[][] adj, int v){
        boolean[] vis = new boolean[v];
        Stack<Integer> st = new Stack<>();

        for(int i=0 ; i<v ; i++){
            if(!vis[i]){
                sort(i,adj, st,vis);
            }
        }

        List<List<Integer>> li = new ArrayList<>();
        for(int i=0 ; i<v ; i++){
            li.add(new ArrayList<>());
        }

        for(int i=0 ; i<v ; i++){
            for(int el : adj[i]){
                li.get(el).add(i);
            }
        }
        
        Arrays.fill(vis,false);
        int count = 0;

        while(!st.isEmpty()){
            int node = st.pop();
            if(!vis[node]){
                connect(node, li, vis);
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int v = 5;
        int[][] adj = {{2,3},{0},{1},{4},{}};

        int res = findStr(adj,v);
        System.out.println(res);
    }
}
