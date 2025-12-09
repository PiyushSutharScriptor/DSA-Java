import java.util.*;

public class MeetingRoomTwo {
    public static void main(String[] args) {
        int[][] meeting = {{1,4},{2,3},{3,6}};

        int n = meeting.length;
        int[] start = new int[n];
        int[] end = new int[n];

        for(int i=0 ; i<n ; i++){
            start[i] = meeting[i][0];
            end[i] = meeting[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);   

        int room = 0;
        int e = 0;

        for(int i=0 ; i<n ; i++){
            if(start[i]<end[e]){
                room++;
            }
            else{
                e++;
            }
        }

        System.out.println(room);
    }
}
