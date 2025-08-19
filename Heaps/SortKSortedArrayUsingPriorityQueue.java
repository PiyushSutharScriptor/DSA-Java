import java.util.PriorityQueue;

public class SortKSortedArrayUsingPriorityQueue {
    public static void main(String[] args) {
        int arr[] = {6, 5, 3, 2, 8, 10, 9};
        int k=3;

        int n = arr.length;
        int ans[] = new int[n];

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0 ; i<=k ; i++){
            pq.add(arr[i]);
        }

        int idx=0;
        for(int i=k+1 ; i<n ; i++){
            ans[idx++] = pq.poll();
            pq.add(arr[i]);
        }

        while(!pq.isEmpty()){
            ans[idx++] = pq.poll();
        }

        for(int el : ans){
            System.out.print(el + " ");
        }
    
    }
}
