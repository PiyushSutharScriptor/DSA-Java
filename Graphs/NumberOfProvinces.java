import java.util.*;

public class NumberOfProvinces {

    public static int findProvinces(int[][] isConnected){
        
        List<List<Integer>> li = new ArrayList<>();
        int n = isConnected.length;

        for(int i=0 ; i<n ; i++){
            li.add(new ArrayList<>());
        }

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                if(i!=j && isConnected[i][j]==1){
                    li.get(i).add(j);
                }
            }
        }

        boolean[] visited = new boolean[n];
        int count = 0;

        for(int i=0 ; i<n ; i++){
            if(!visited[i]){
                dfs(i,li,visited);
                count++;
            }
        }

        return count;
    }

    public static void dfs(int node, List<List<Integer>> li, boolean[] visited){
        visited[node] = true;
        for(int el : li.get(node)){
            if(!visited[el]){
                dfs(el, li, visited);
            }
        }
    }

    public static void main(String[] args) {
        int[][] isConnected = {{1,1,0},{1,1,0},{0,0,1}};

        int res = findProvinces(isConnected);
        System.out.println(res);
    }
}
