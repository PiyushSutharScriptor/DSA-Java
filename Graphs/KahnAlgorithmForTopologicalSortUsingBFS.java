import java.util.*;

public class KahnAlgorithmForTopologicalSortUsingBFS {

    public static int[] findOrder(int[][] edges , int v){
        List<List<Integer>> li = new ArrayList<>();

        for(int i=0 ; i<v ; i++){
            li.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            int U = edge[0];
            int V = edge[1];

            li.get(U).add(V);
        }

        int degArr[] = new int[v];

        for(int i=0 ; i<v ; i++){
            for(int el : li.get(i)){
                degArr[el]++;
            }
        }

        Queue<Integer> que = new LinkedList<>();

        for(int i=0 ; i<v  ; i++){
            if(degArr[i]==0) que.add(i);
        }

        int res[] = new int[v];
        int m=0;

        while(!que.isEmpty()){
            int n = que.poll();
            res[m++] = n;
            
            for(int el : li.get(n)){
                degArr[el]--;
                if(degArr[el]==0) que.add(el);
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int[][] edges = {{5,0},{4,0},{5,2},{2,3},{3,1},{4,1}};
        int v = 6;

        int[] res = findOrder(edges,v);

        for(int el : res){
            System.out.print(el + " ");
        }
    }
}
