public class LongestSubArrayWithSumK2PointerSW {
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        int k = 4;

        int n = arr.length;

        int l=0;
        int r=0;

        int maxi = 0;
        int sum = 0;

        while(r<n){

            sum += arr[r];

            while(l<=r && sum>k){
                sum-=arr[l];
                l--;
            }

            if(sum<=k){
                maxi = Math.max(r-l+1,maxi);
            }
            r++;
        }

        System.out.println(maxi);

    }
}
