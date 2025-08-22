import java.util.*;

public class ConnectNRopesWithMinimalCostOptimized {
    public static void main(String[] args) {
        int arr[] = {5, 4, 2, 8, 6, 3};

        int n = arr.length;

        PriorityQueue <Integer> min = new PriorityQueue<>();

        for(int i=0 ; i<n ; i++){
            min.add(arr[i]);
        }

        int res = 0;
        while (min.size()>1) {
            int first = min.poll();
            int second = min.poll();
            int cost = first+second;
            res+=cost;
            min.add(cost);
        }

        System.out.println(res);
    }
}
