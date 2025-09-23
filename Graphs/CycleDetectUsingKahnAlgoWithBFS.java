import java.util.*;

public class CycleDetectUsingKahnAlgoWithBFS {

    public static boolean findOrder(int[][] edges , int v){
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

        List<Integer> res = new ArrayList<>();

        while(!que.isEmpty()){
            int n = que.poll();
            res.add(n);
            
            for(int el : li.get(n)){
                degArr[el]--;
                if(degArr[el]==0) que.add(el);
            }
        }

        //option : 1
        if(res.size()==v) return false;
        return true;

        //option : 2
        /*for(int el : degArr){
            if(el)>0 return true;
        }
        return false;
        */
    }
    public static void main(String[] args) {
        int[][] edges = {{0,1},{1,2},{2,4},{2,3},{3,1}};
        int v = 5;

        System.out.println(findOrder(edges,v));

    }
}
