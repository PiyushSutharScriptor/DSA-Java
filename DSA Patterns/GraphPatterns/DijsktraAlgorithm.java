import java.util.*;

class Pair{
    int dist;
    int node;

    Pair(int dist1, int node1){
        this.dist = dist1;
        this.node = node1;
    }
}

public class DijsktraAlgorithm{

    public static int[] findMin(int[][] grid , int k, int v){

        //adjacency list
        List<List<Pair>> li = new ArrayList<>();
        for(int i=0 ; i<v ; i++){
            li.add(new ArrayList<>());
        }

        for(int[] arr : grid){
            li.get(arr[0]).add(new Pair(arr[2], arr[1]));
        }


        //distance array : 
        int[] distance = new int[v];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[k] = 0;

        //priority queue
        PriorityQueue<Pair> que = new PriorityQueue<>((a,b)->a.dist-b.dist);
        que.add(new Pair(0, k));

        while(!que.isEmpty()){
            Pair pr = que.poll();
            int d = pr.dist;
            int n = pr.node;

            for(Pair el : li.get(n)){
                int newDist = el.dist+d;
                int elNode = el.node;
                if(distance[elNode]>newDist){
                    que.add(new Pair(newDist, elNode));
                    distance[elNode] = newDist;
                }
            }

        }

        return distance;

    }

    public static void main(String[] args){
        int[][] grid = {{0,1,4},{0,2,4},{1,0,4},{1,2,2},{2,0,4},{2,1,2},{2,3,3},{2,4,1},{2,5,6},{3,2,3},{3,5,2},{4,2,1},{4,5,3},{5,2,6},{5,3,2},{5,4,3}};

        int k = 0; 
        int v = 6;

        int res[] = findMin(grid, k, v);
        for(int el : res){
            System.out.print(el + " ");
        }
    }
}