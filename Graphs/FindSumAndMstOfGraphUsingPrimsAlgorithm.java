import java.util.*;

class Pair{
    int node;
    int dist;

    Pair(int dist1, int node1){
        this.dist = dist1;
        this.node = node1;
    }
}

class QPair{
    int dist;
    int node;
    int parent;

    QPair(int dist1, int node1, int parent1){
        this.dist = dist1;
        this.node = node1;
        this.parent = parent1;
    }
}
      
public class FindSumAndMstOfGraphUsingPrimsAlgorithm{

    public static List<List<Integer>> findSum(int[][] edges, int v){

        List<List<Pair>> li = new ArrayList<>();
        for(int i=0 ; i<v ; i++){
            li.add(new ArrayList<>());
        }
        
        for(int[] edge : edges){
            int U = edge[0];
            int V = edge[1];
            int D = edge[2];
            
            li.get(U).add(new Pair(D,V));
            li.get(V).add(new Pair(D,U));
        }
        
        boolean[] visited = new boolean[v];
        
        PriorityQueue<QPair> que = new PriorityQueue<>((a,b)->a.dist-b.dist);
        que.add(new QPair(0, 0,-1));
        
        int sum = 0;
        List<List<Integer>> res = new ArrayList<>();

        while(!que.isEmpty()){
            QPair p = que.poll();
            int nd = p.node;
            int d = p.dist;
            int pt = p.parent;

            if(!visited[nd]){
                visited[nd] = true;
                sum+=d;

                if(pt!=-1){
                    res.add(new ArrayList<>(List.of(pt,nd)));
                }

                for(Pair pr : li.get(nd)){
                    if(!visited[pr.node]){
                        que.add(new QPair(pr.dist, pr.node, nd));
                    }
                }

            }
        }

        System.out.println("Sum of MST : " + sum);

        return res;

    }

    public static void main(String[] args) {
        int[][] edges = {{0,1,2},{0,2,1},{1,2,1},{2,4,2},{2,3,2},{3,4,1}};
        int v = 5;

        List<List<Integer>> res = findSum(edges,v);
        System.out.println(res);
    }
}

