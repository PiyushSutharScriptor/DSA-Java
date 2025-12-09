import java.util.*;

public class InsertInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = {4,8};

        int m = intervals.length;
        int i=0;
        List<int[]> li = new ArrayList<>();

        //add 
        while(i<m && newInterval[0]>intervals[i][1]){
            li.add(new int[]{intervals[i][0],intervals[i][1]});
            i++;
        }
 
        while(i<m && intervals[i][0]<=newInterval[1]){
            newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        li.add(newInterval);

        while(i<m){
            li.add(new int[]{intervals[i][0],intervals[i][1]});
            i++;
        }

        for(int[] arr : li){
            System.out.println(Arrays.toString(arr));
        }
    }

}
