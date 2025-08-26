import java.util.*;

class Pair{
    int num;
    int den;

    Pair(int num, int den){
        this.num = num;
        this.den = den;
    }
}

public class NMeetingsInOneRoom {
    public static void main(String[] args) {
        int start[] = {0,3,1,5,5,8};
        int end[] = {5,4,2,9,7,9};

        int n = end.length;

        Pair[] p = new Pair[n];

        for(int i=0 ; i<n ; i++){
            p[i] = new Pair(start[i], end[i]);
        }

        Arrays.sort(p, (p1,p2) -> Integer.compare(p1.den,p2.den));

        int endTime = 0;
        int count = 0;

        for(int i=0 ; i<n ; i++){
            if(p[i].num>endTime){  //choose this condition asa per question (> , >=)
                endTime = p[i].den;
                count++;
            }
        }

        System.out.println(count);
    }
}
