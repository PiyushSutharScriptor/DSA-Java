import java.util.*;

public class KthSmallestElementBrute {
    public static void main(String[] args) {
        int[][] arr = {{1,5,9},{10,11,13},{12,13,15}};
        int k = 8;

        int n = arr.length;
        int[] ans = new int[n*n];
        
        int t=0;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                ans[t] = arr[i][j];
                t++;
            }
        }

        Arrays.sort(ans);
        System.out.println(ans[k-1]);
    }
}
