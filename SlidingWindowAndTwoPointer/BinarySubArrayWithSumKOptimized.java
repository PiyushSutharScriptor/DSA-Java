public class BinarySubArrayWithSumKOptimized {

    public static int findBSubArray(int arr[] , int k){
        int n = arr.length;
        int count = 0;
        int l = 0;
        int sum = 0;

        for(int r=0 ; r<n ; r++){
            if(k<0) return 0;
            sum+=arr[r];
            while(sum>k){
                sum-=arr[l];
                l++;
            }
            int len = r-l+1;
            count += len;
        }

        return count;

    }
    public static void main(String[] args) {
        int arr[] = {1,0,0,1,1,0};
        int k = 2;

        
        System.out.println(findBSubArray(arr,k)-findBSubArray(arr, k-1));

    }
}
