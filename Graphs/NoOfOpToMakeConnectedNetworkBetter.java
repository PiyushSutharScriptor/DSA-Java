import java.util.*;

class DisjointSet{
    ArrayList<Integer> parent = new ArrayList<>();
    ArrayList<Integer> size = new ArrayList<>();

    public DisjointSet(int n){
        for(int i=0 ; i<n ; i++){
            parent.add(i);
            size.add(1);
        }
    }

    public int findParent(int node){
        if(node == parent.get(node)) return node;
        int pq = findParent(parent.get(node));
        parent.set(node, pq);

        return pq;
    }

    public void union(int u, int v){
        int pu = findParent(u);
        int pv = findParent(v);

        if(pu==pv) return;

        if(size.get(pu)<size.get(pv)){
            parent.set(pu, pv);
            size.set(pv,size.get(pv)+size.get(pu));
        }
        else{
            parent.set(pv,pu);
            size.set(pu, size.get(pu)+size.get(pv));
        }
    }
}

public class NoOfOpToMakeConnectedNetworkBetter{
    
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

        //finding connected components
        boolean[] visited = new boolean[v];

        int sum = 0;
        for(int i=0 ; i<v ; i++){
            if(!visited[i]){
                dfs(li,visited,i);
                sum++;
            }
        }


        //finding extra edges : 
        int extra = 0;

        DisjointSet d1 = new DisjointSet(v);
        for(int i=0 ; i<v ; i++){
            for(int el : li.get(i)){    
                int u1 = d1.findParent(i);
                int v1 = d1.findParent(el);

                if(u1==v1) extra++;
                d1.union(i, el);
            }
        }
        if(extra>=sum) return sum-1;
        return -1;
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