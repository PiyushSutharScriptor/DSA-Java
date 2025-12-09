import java.util.*;

public class MergeIntervalsOptimized{
    public static void main(String[] args) {
        int[][] intervals = {{4,7},{1,4}};

        //sort the intervals 
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));

        //merging
        int n = intervals.length;
        List<int[]> li = new ArrayList<>();

        int x = intervals[0][0];
        int y = intervals[0][1];

        for(int i=0 ; i<n ; i++){
            if(intervals[i][1]<=y) continue;

            if(intervals[i][1]>y && intervals[i][0]<=y){
                y = intervals[i][1];
            }
            else{
                li.add(new int[]{x,y});
                x = intervals[i][0];
                y = intervals[i][1];
            }
        }

        li.add(new int[]{x,y});
        for(int[] arr : li){
            System.out.println(Arrays.toString(arr));
        }
    }
}