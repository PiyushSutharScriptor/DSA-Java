import java.util.*;

class Pair{
    int id;
    int dl;
    int pt;

    Pair(int id, int dl, int pt){
        this.id = id;
        this.dl = dl;
        this.pt = pt;
    }
}

public class JobSequenceOptimized{
    public static void main(String[] args) {
        int jobs[][] = {{1,4,20},{2,1,10},{3,1,40},{4,1,30}};

        int m = jobs.length;

        Pair p[] = new Pair[m];
        for(int i=0 ; i<m ; i++){
            p[i] = new Pair(jobs[i][0] ,jobs[i][1] ,jobs[i][2]);
        }

        Arrays.sort(p, (p1,p2)-> Integer.compare(p2.pt,p1.pt));

        int maxDays = 0;
        for(Pair el : p){
            maxDays = Math.max(maxDays,el.dl);
        }   

        int arr[] = new int[maxDays+1];
        Arrays.fill(arr,-1);

        int profit = 0;
        int count = 0;

        for(int i=0 ; i<m ; i++){
            int idx = p[i].dl;
            if(arr[idx]!=-1){
                while(idx>0 && arr[idx]!=-1){
                    idx--;
                }
            }
            if(idx>0){
                profit+=p[i].pt;
                arr[idx] = p[i].id;
                count++;
            }
        }

        System.out.println(profit);
        System.err.println(count);

    }
}
