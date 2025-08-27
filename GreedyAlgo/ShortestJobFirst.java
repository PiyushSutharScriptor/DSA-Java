import java.util.*;

public class ShortestJobFirst {
    public static void main(String[] args) {
        int jobs[] = {4,3,7,1,2};

        int n = jobs.length;

        Arrays.sort(jobs);

        int sum = 0;
        int total = 0;
        for(int i=0 ; i<n-1 ; i++){
            total+=jobs[i];
            sum+=total;
        }

        double ans = sum/n;
        System.out.println(ans);
    }
}
