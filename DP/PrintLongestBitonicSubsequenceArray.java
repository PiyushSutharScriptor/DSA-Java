import java.util.*;

public class PrintLongestBitonicSubsequenceArray {
    public static void main(String[] args) {
        int[] arr = {1,11,2,10,4,5,2,1};

        int n = arr.length;
        int dp1[] = new int[n];
        int dp2[] = new int[n];

        Arrays.fill(dp1,1);
        Arrays.fill(dp2,1);

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<i ; j++){
                if(arr[i]>arr[j] && dp1[j]+1>dp1[i]){
                    dp1[i] = dp1[j]+1;
                }
            }
        }

        for(int i=n-1 ; i>=0 ; i--){
            for(int j=n-1 ; j>i ; j--){
                if(arr[i]>arr[j] && dp2[j]+1>dp2[i]){
                    dp2[i] = dp2[j]+1;
                }
            }
        }

        int[] res = new int[n];

        for(int i=0 ; i<n ; i++){
            res[i] = dp1[i]+dp2[i]-1;
        }

        for(int el : res){
            System.out.print(el + " ");
        }

    }
}
