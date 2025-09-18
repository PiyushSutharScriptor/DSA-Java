import java.util.*;

public class DetectCycleInConnectedComponent {

    public static boolean findCyc(int[][] edges, int v){
        List<List<Integer>> li = new ArrayList<>();

        for(int i=0 ; i<=v ; i++){
            li.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            int U = edge[0];
            int V = edge[1];

            li.get(U).add(V);
            li.get(V).add(U);
        }

        Queue<Pair> que = new LinkedList<>();
        boolean[] visited = new boolean[v+1];

        for(int i=1 ; i<=v ; i++){
            if(!visited[i]){
                if(bfs(i,que,edges,visited,li)==true){
                    return true;
                }
            }
        }
        
        return false;
    }

    public static boolean bfs(int i, Queue<Pair> que,int[][] edges, boolean[] visited, List<List<Integer>> li){
        
        que.add(new Pair(i, -1));
        while(!que.isEmpty()){
            int node = que.peek().node;
            int parent = que.peek().parent;

            que.poll();
            if(!visited[node]){
                visited[node] = true;
            }

            for(int el : li.get(node)){
                if(!visited[el]){
                    visited[el] = true;
                    que.add(new Pair(el, node));
                }
                else if(parent!=el){
                    return true;
                }
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

        System.out.println(findCyc(edges, v));
    }
}
