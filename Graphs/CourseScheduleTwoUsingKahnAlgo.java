import java.util.*;

public class CourseScheduleTwoUsingKahnAlgo {

    public static List<Integer> courseSchedule2(int edges[][] , int v){
        List<List<Integer>> li = new ArrayList<>();

        for(int i=0 ; i<v ; i++){
            li.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            int U = edge[0];
            int V = edge[1];
            //condition : v->u
            li.get(V).add(U);
        }

        int[] degarr = new int[v];

        for(int i=0 ; i<v ; i++){
            for(int el : li.get(i)){
                degarr[el]++;
            }
        }

        Queue<Integer> que = new LinkedList<>();

        for(int i=0 ; i<v ; i++){
            if(degarr[i]==0) que.add(i);
        }

        List<Integer>res = new ArrayList<>();
        while(!que.isEmpty()){
            int n = que.poll();
            res.add(n);
            
            for(int el : li.get(n)){
                degarr[el]--;
                if(degarr[el]==0) que.add(el);
            }
        }

        if(res.size()==v) return res;
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        int edges[][] = {{1,0},{2,0},{3,1},{3,2}};
        int v = 4;

        List<Integer> res = courseSchedule2(edges,v);

        System.out.println(res);
    }
}
