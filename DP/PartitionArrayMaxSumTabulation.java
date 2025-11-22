public class PartitionArrayMaxSumTabulation {

    public static int  findMax(int[] arr, int k){
        
        int n = arr.length;
        int[] dp = new int[n+1];

        for(int i=n-1 ; i>=0 ; i--){

            int sum = Integer.MIN_VALUE;
            int maxi = Integer.MIN_VALUE;
            int len = 0;
            
            for(int j=i ; j<(Math.min(i+k,n)) ; j++){
                len++;
                maxi = Math.max(maxi,arr[j]);
                
                int total = len*maxi + dp[j+1];
                sum = Math.max(sum,total);
            }   

            dp[i] = sum;
        }

        return dp[0];
    }
        
    public static void main(String[] args) {
        int[] arr = {1,15,7,9,2,5,10};
        int k = 3;

        int res = findMax(arr,k);
        System.out.println(res);
    }    
}

