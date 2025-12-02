public class LongestSubArrayWithSumKOptimized {
    public static void main(String[] args) {
        int[] arr = {2,5,1,7,10};
        int k = 14;

        int n = arr.length;

        int l=0;
        int r=0;

        int sum = 0;
        int maxi = 0;

        while(r<n){
            sum+=arr[r];

            if(sum>k){
                sum-=arr[l];
                l++;
            }

            if(sum<=k){
                maxi = Math.max(maxi,r-l+1);
            }

            r++;
        }

        System.out.println(maxi);
    }
}
