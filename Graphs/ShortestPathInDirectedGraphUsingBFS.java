import java.util.*;

class Pair{
    int node;
    int dist;

    Pair(int node1, int dist1){
        this.node = node1;
        this.dist = dist1;
    }
}

public class ShortestPathInDirectedGraphUsingBFS {

    public static int[] findPath(int[][] edges, int v, int k){
        List<List<Integer>> li = new ArrayList<>();

        for(int i=0 ; i<v ; i++){
            li.add(new ArrayList<>());
        }
        for(int edge[] : edges){
            int U = edge[0];
            int V = edge[1];

            li.get(U).add(V);
            li.get(V).add(U);
        }

        int[] arr = new int[v];
        Arrays.fill(arr,-1);

        Queue<Pair> que = new LinkedList<>();
        que.add(new Pair(k, 0));
        arr[0] = 0;

        while(!que.isEmpty()){
            Pair p = que.poll();
            int node = p.node;
            int dist = p.dist;

            for(int el : li.get(node)){
                if(arr[el]==-1){
                    que.add(new Pair(el, dist+1));
                    arr[el] = dist+1;
                }
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        int edges[][] = {{0,1},{0,3},{3,4},{4,5},{5,6},{1,2},{2,6},{6,7},{7,8},{6,8}};
        int v = 9;
        int k = 0;

        int[] res = findPath(edges,v,k);

        for(int el : res){
            System.out.print(el + " ");
        }

        //output : 012123344
    }
}

