import java.util.*;

public class IsGraphBipartiteUsingBFS {
    public static boolean isBipartite(int[][] graph){
        int n = graph.length;

        int[] visited = new int[n];

        //1 - red
        //-1 - green

        for(int i=0 ; i<n ; i++){
            if(visited[i]!=0) continue;

            Queue<Integer> que = new LinkedList<>();
            que.add(i);
            visited[i] = 1;

            while(!que.isEmpty()){
                int node = que.poll();

                for(int el : graph[node]){
                    if(visited[el]==visited[node]) return false;

                    if(visited[el]==0){
                        visited[el] = -visited[node];
                        que.add(el);
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] graph = {{1,2,3},{0,2},{0,1,3},{0,2}};

        System.out.println(isBipartite(graph));
    }
}

