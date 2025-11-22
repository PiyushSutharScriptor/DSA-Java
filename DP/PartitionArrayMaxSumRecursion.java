public class PartitionArrayMaxSumRecursion {

    public static int  findMax(int ind, int n , int[] arr, int k){

        if(ind==n) return 0;

        int sum = Integer.MIN_VALUE;
        int maxi = Integer.MIN_VALUE;
        int len = 0;

        for(int j=ind ; j<(Math.min(ind+k,n)) ; j++){
            len++;
            maxi = Math.max(maxi,arr[j]);

            int total = len*maxi + findMax(j+1, n, arr, k);
            sum = Math.max(sum,total);
        }   

        return sum;
    }
        
    public static void main(String[] args) {
        int[] arr = {1,15,7,9,2,5,10};
        int k = 3;

        int n = arr.length;

        int res = findMax(0,n,arr,k);
        System.out.println(res);
    }    
}
