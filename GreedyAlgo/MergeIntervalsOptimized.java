import java.util.ArrayList;
import java.util.List;

public class MergeIntervalsOptimized{
    public static void main(String[] args) {
        int arr[][] = {{1,3},{2,6},{8,10},{15,18}};
        int n = arr.length;

        List<int[]> res = new ArrayList<>();
        int pair[] = {arr[0][0] , arr[0][1]};
        
        for(int i=1 ; i<n ; i++){
            if(arr[i][0]<=pair[1]){
                pair[0] = Math.min(pair[0],arr[i][0]);
                pair[1] = Math.max(pair[1],arr[i][1]);
            }
            else{
                res.add(pair);
                pair = new int[]{arr[i][0] , arr[i][1]};
            }
        }

        res.add(pair);

        for(int[] interval : res){
            System.out.println(interval[0] + " " + interval[1]);
        }

        //note : we can return a list<int[]> to int[][] by below : 
        //       return -> res.toArray(new int[res.size()][]); 
    }
}