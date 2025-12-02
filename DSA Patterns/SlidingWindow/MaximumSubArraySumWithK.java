public class MaximumSubArraySumWithK{
    public static void main(String[] args) {
        int[] arr = {-1,2,3,3,4,5,-1};
        int k = 4;

        int n = arr.length;
        int sum = 0;

        for(int i=0 ; i<k ; i++){
            sum+=arr[i];
        }

        int i=0;
        int j=k-1;
        int maxi = Integer.MIN_VALUE;

        while(j<n-1){
            sum-=arr[i];
            i++;

            j++;
            sum+=arr[j];

            maxi = Math.max(maxi, sum);
        }

        System.out.println(maxi);
    
    }   
}