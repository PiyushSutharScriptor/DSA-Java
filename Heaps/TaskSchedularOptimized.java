import java.util.*;

public class TaskSchedularOptimized {

    public static int leastInterval(char arr[] , int n){
        int freq[] = new int[26];
        for(char ch : arr){
            freq[ch-'A']++;
        }

        Arrays.sort(freq);
        int countFreq = 0;
        int maxFreq = freq[25];

        for(int i=25 ; i>=0 ; i--){
            if(freq[i]==maxFreq) countFreq++;
            else break;
        }


        int gaps = maxFreq-1;
        int gapfilling = n+1;

        int ans = gaps*gapfilling+countFreq;

        return Math.max(arr.length , ans);

        /* 
            Example : 'A','A','A','B','B','B','B';

            so here the maxFreq = B (4 times)
            so, 
                B_B_B_B 
                gaps = 3 , the gaps must be filled with 'n'value+1(task)
                gapfilling = 3 (n=2)

                count = 1 (because only the 'B' hash maxFreq) 
                           Note if A appears 4 times then count will be 2;
                
                we are returning max because if n=0 , then there will be no cooldown 
                and the  res = gaps*gapsfilling+count;
        */

    }
    public static void main(String[] args) {
        char arr[] = {'A','A','A','B','B','B'};
        int n = 2;

        System.out.println(leastInterval(arr,n));
    }
}
