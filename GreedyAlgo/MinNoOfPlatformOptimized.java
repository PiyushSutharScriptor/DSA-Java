import java.util.*;

public class MinNoOfPlatformOptimized {
    public static void main(String[] args) {
        int start[] = {900, 945, 955, 1100, 1500, 1800};
        int end[] = {920, 1200, 1130, 1150, 1900, 2000};

        int n = start.length;

        Arrays.sort(start);
        Arrays.sort(end);
        
        int l = 0;
        int r = 0;

        int count = 0;
        int maxi = Integer.MIN_VALUE;

        while(l<n){
            if(end[r]>=start[l]){
                count++;
                l++;
            }
            else{
                count--;
                r++;
            }

            maxi = Math.max(maxi, count);
        }

        System.out.println(maxi);
    }
}
