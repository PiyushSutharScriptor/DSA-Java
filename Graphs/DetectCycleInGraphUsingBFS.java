import java.util.*;

class Pair{
    int node;
    int parent;

    Pair(int node1, int parent1){
        this.node = node1;
        this.parent = parent1;
    }
}

public class DetectCycleInGraphUsingBFS {

    public static boolean findCycle(int[][] edges, int v, int k){
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

        que.add(new Pair(k, -1));

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
        int[][] edges = {{1,2},{2,5},{5,7},{7,6},{6,3},{3,1},{3,4}};
        int v = 7;
        int k = 1;

        System.out.println(findCycle(edges,v,k));
    }
}
