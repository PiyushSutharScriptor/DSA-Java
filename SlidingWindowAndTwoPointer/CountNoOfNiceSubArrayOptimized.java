public class CountNoOfNiceSubArrayOptimized {
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
        int arr[] = {1,1,2,1,1};
        int k = 2;

        int n = arr.length;

        int newArr[] = new int[n];

        for(int i=0 ; i<n ; i++){
            if(arr[i]%2!=0) newArr[i]=1;
        }
        
        System.out.println(findBSubArray(newArr,k)-findBSubArray(newArr, k-1));
    }
}
