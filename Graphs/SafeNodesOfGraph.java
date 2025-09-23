import java.util.*;

public class SafeNodesOfGraph {

    public static List<Integer> findSafenode(int grid[][]){
        int n = grid.length;

        List<List<Integer>> li = new ArrayList<>();

        for(int i=0 ; i<n ; i++){
            li.add(new ArrayList<>());
        }

        //revering the graph
        for(int i=0 ; i<n ; i++){
            for(int el : grid[i]){
                li.get(el).add(i);
            }
        }

        //indegree array
        int[] indeg = new int[n];
        for(int i=0 ; i<n ; i++){
            for(int el : li.get(i)){
                indeg[el]++;
            }
        }

        Queue<Integer> que = new LinkedList<>();
        for(int i=0 ; i<n ; i++){
            if(indeg[i]==0) que.add(i);
        }   

        List<Integer> res = new ArrayList<>();
        while(!que.isEmpty()){
            int node = que.poll();
            res.add(node);
            for(int el : li.get(node)){
                indeg[el]--;
                if(indeg[el]==0) que.add(el);
            }
        }   

        Collections.sort(res);
        
        return res;
    }
    public static void main(String[] args) {
        int graph[][] = {{1,2},{2,3},{5},{0},{5},{},{}};   

        List<Integer> res = findSafenode(graph);

        System.out.println(res);
        //output : 4
    }
}
