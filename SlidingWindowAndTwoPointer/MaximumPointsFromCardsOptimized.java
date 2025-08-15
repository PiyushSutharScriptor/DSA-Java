public class MaximumPointsFromCardsOptimized{
    public static void main(String[] args) {
        int arr[] = {6,2,3,4,7,2,1,7,1};
        int k=4;

        int n = arr.length;
        int lsum = 0;
        int rsum = 0;
        int maxSum = 0;
        
        for(int i=0 ; i<k ; i++){
            lsum+=arr[i];
        }
        maxSum = lsum ;

        int r = 1;
        for(int i=k-1 ; i>=0 ; i--){
            lsum-=arr[i];
            rsum+=arr[n-r];
            maxSum = Math.max(maxSum,lsum+rsum);
            r++;
        }

        System.out.println(maxSum);
    }
}