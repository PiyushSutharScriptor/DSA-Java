import java.util.*;

public class InsertIntervalsOptimized {
    public static void main(String[] args) {
        int arr[][] = {{1,2},{3,4},{5,7},{8,10},{12,16}};
        int target[] = {6,8};
        int m = arr.length;

        List<int[]> res = new ArrayList<>();
        int i = 0;

        while(i<m && arr[i][1] < target[0]){
            res.add(new int[]{arr[i][0], arr[i][1]});
            i++;
        }

        while(i<m && arr[i][0] <= target[1]){
            target[0] = Math.min(target[0], arr[i][0]);
            target[1] = Math.max(target[1], arr[i][1]);
            i++;
        }
        res.add(target);

        while(i<m){
            res.add(new int[]{arr[i][0], arr[i][1]});
            i++;
        }

        for(int[] interval : res){
            System.out.println(interval[0] + " " + interval[1]);
        }

        //note : we can return a list<int[]> to int[][] by below : 
        //       return -> res.toArray(new int[res.size()][]); 
    }
}
