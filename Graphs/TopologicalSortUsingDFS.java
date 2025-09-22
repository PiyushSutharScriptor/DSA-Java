import java.util.*;

public class TopologicalSortUsingDFS {

    public static int[] findOrder(int[][] edges, int n){

        List<List<Integer>> li = new ArrayList<>();

        for(int i=0 ; i<n ; i++){
            li.add(new ArrayList<>());
        }
 
        for(int[]edge : edges){
            int u = edge[0];
            int v = edge[1];

            li.get(u).add(v);
        }

        boolean[] visited = new boolean[n];
        Stack<Integer> st = new Stack<>();

        for(int i=0 ; i<n ; i++){
            if(!visited[i]){
                dfs(i,visited,edges,st,li);
            }
        }

        int arr[] = new int[st.size()];
        int i=0;

        while(!st.isEmpty()){
            arr[i++] = st.pop();
        }

        return arr;
    }

    public static void dfs(int node,boolean[] visited,int[][] edges,Stack<Integer> st,List<List<Integer>> li){
        visited[node] = true;

        for(int el : li.get(node)){
            if(!visited[el]){
                dfs(el, visited, edges, st, li);
            }
        }

        st.push(node);
    }

    public static void main(String[] args) {
        int edges[][] = {{5,0},{4,0},{5,2},{2,3},{3,1},{4,1}};
        int v = 6;

        int res[] = findOrder(edges,v);

        for(int el : res){
            System.out.print(el + " ");
        }
    }
}
