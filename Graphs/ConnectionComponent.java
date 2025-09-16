import java.util.*;

public class ConnectionComponent {

    public static int countComp(int v, int[][]edges){
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

        int count = 0;

        boolean visited[] = new boolean[v];

        for(int i=0 ; i<v ; i++){
            if(!visited[i]){
                dfs(i,visited,li);
                count++;
            }
        }
        
        return count;
    }
    
    public static void dfs(int i, boolean[] visited, List<List<Integer>> li){
        visited[i] = true;
        for(int el : li.get(i)){
            if(!visited[el]){
                dfs(el,visited,li);
            }
        }
    }

    public static void main(String[] args) {
        int v = 7;
        int [][] edges = {{0, 1}, {1, 2}, {2, 3}, {4, 5}};

        int res = countComp(v,edges);
        System.out.println(res);
    }
}
