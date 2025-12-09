import java.util.*;

public class NonOverlappingIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};

        Arrays.sort(intervals , (a,b)->Integer.compare(a[0],b[0]));
        
        int count = 0;

        int prevEnd = intervals[0][1];
        for(int i=1 ; i<intervals.length ; i++){
            if(intervals[i][0]<prevEnd){
                count++;
                prevEnd = Math.min(prevEnd,intervals[i][1]);
            }
            else prevEnd=intervals[i][1];
        }

        System.out.println(count);
    }
}
