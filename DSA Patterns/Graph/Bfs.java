import java.util.*;

public class Bfs {

    public static List<Integer> findBfs(int[][] edges, int k, int v){
        //adjacency list : 
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

        Queue<Integer> que = new LinkedList<>();
        boolean[] visited = new boolean[v];
        List<Integer> res = new ArrayList<>();

        que.add(k);

        while(!que.isEmpty()){
            int el = que.poll();
            visited[el] = true;
            res.add(el);
            for(int ele : li.get(el)){
                if(!visited[ele]){
                    que.add(ele);
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] edges = {{0,1},{0,2},{1,3},{2,4}};
        int k = 0;
        int v = 5;

        List<Integer> res = findBfs(edges,k,v);
        System.out.println(res);
    }
}
