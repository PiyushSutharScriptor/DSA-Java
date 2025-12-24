import java.util.*;

public class Starter218Problem04
{
    public static void main(String[] args) throws java.lang.Exception
    {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t != 0) {

            int n = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int[] cost = new int[n];
            for (int i = 0; i < n; i++) {
                cost[i] = sc.nextInt();
            }

            int ans = arr[0]*cost[0];
            for(int i=1 ; i<n ; i++){
                
                cost[i] = Math.min(cost[i], cost[i - 1]);
                
                int idx = i;
                int j=i+1;
                int count = 0;
                int val = arr[i];
                
                while(j<n && cost[j]>=cost[idx]){
                    count++;
                    val+=arr[j];
                    j++;
                }
                
                i+=count;
                ans+=cost[idx]*val;
            }
            
            System.out.println(ans);

            t--;
        }
    }
}