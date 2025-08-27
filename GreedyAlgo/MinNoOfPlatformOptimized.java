import java.util.*;

class Pair{
    int num;
    char pos;

    Pair(int num, char pos){
        this.num = num;
        this.pos = pos;
    }
}
public class MinNoOfPlatformOptimized {
    public static void main(String[] args) {
        int start[] = {900, 945, 955, 1100, 1500, 1800};
        int end[] = {920, 1200, 1130, 1150, 1900, 2000};

        int n = start.length;

        Pair p[] = new Pair[n+n];
        for(int i=0 ; i<n ; i++){
            p[i] = new Pair(start[i], 'A');
        }
        for(int i=n ; i<n+n ; i++){
            p[i] = new Pair(end[i-n], 'B');
        }

        Arrays.sort(p, (p1,p2) -> Integer.compare(p1.num,p2.num));

        int maxi = Integer.MIN_VALUE;
        int count = 0;
        for(int i=0 ; i<p.length ; i++){
            if(p[i].pos == 'A') count++;
            else count--;

            maxi = Math.max(maxi,count);
        }

        System.out.println(maxi);
    }
}
