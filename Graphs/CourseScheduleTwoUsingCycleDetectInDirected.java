import java.util.*;

public class CourseScheduleTwoUsingCycleDetectInDirected {

    public static int[] courseSchedule(int[][] edges, int v){
        List<List<Integer>> li = new ArrayList<>();

        for(int i=0 ; i<v ; i++){
            li.add(new ArrayList<>());
        }

        for(int[]edge : edges){
            int U = edge[0];
            int V = edge[1];

            li.get(V).add(U);
        }

        boolean[] visited = new boolean[v];
        boolean[] pathvist = new boolean[v];

        Stack<Integer> st = new Stack<>();

        for(int i=0 ; i<v ; i++){
            if(!visited[i]){
                if(dfs(i,visited,pathvist,edges,li,st)) return new int[0];
            }
        }

        int arr[] = new int[st.size()];
        int i=0;

        while(!st.isEmpty()){
            arr[i++] = st.pop();
        }

        return arr;

    }

    public static boolean dfs(int node, boolean[] visited, boolean[] pathvist, int[][] edges, List<List<Integer>>li, Stack<Integer> st){
        visited[node] = true;
        pathvist[node] = true;

        for(int el : li.get(node)){
            
            if(!visited[el]){
                if(dfs(el, visited, pathvist, edges, li, st)) return true;
            }
            else if(pathvist[el]){
                return true;
            }
        }
        st.push(node);
        pathvist[node] = false;

        return false;
    }

    public static void main(String[] args) {
        int edges[][] = {{1,0},{2,0},{3,1},{3,2}};
        int v = 4;

        int[] res = courseSchedule(edges,v);

        for(int el : res){
            System.out.print(el + " ");
        }
    }
}
