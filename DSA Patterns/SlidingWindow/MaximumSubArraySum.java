public class MaximumSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-1,2,3,3,4,5,-1};

        int n = arr.length;

        int sum = 0;
        int maxi = 0;
        
        for(int i=0 ; i<n ; i++){
            sum+=arr[i];
            if(sum>maxi) maxi=sum;

            if(sum<0) sum=0;
        }

        System.out.println(maxi);
    }
}
