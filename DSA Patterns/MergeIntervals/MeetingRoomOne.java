import java.util.*;

public class MeetingRoomOne {

    public static boolean findOverlap(int[][] meeting){
        int n = meeting.length;
        Arrays.sort(meeting , (a,b)->Integer.compare(a[0],b[0]));

        for(int i=1 ; i<n ; i++){
            if(meeting[i][0]<meeting[i-1][1]) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] meeting = {{0,30},{5,10},{15,20}};

        System.out.println(findOverlap(meeting));
    }
}
