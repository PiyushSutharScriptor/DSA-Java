import java.util.*;

class Pair{
    int idx;
    int num1;
    int num2;

    Pair(int idx1, int numa, int numb){
        this.idx = idx1;
        this.num1 = numa;
        this.num2 = numb;
    }
}

public class MaximumCpuLoad {
    public static void main(String[] args) {
        int[][] tasks = {{7,10},{7,12},{7,5},{7,4},{7,2}};

        int n = tasks.length;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.num2-b.num2);
        for(int i=0 ; i<n ; i++){
            pq.add(new Pair(i,tasks[i][0],tasks[i][1]));
        }

        int[] res = new int[n];
        int i=0;

        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            res[i++] = p.idx;
        }

        for(int el : res){
            System.out.print(el + " ");
        }

    }
}
