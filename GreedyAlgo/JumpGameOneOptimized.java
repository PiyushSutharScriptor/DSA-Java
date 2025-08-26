public class JumpGameOneOptimized {

    public static boolean isPossible(int arr[]){
        int n = arr.length;

        int maxi = 0;
        for(int i=0 ; i<n ; i++){
            if(i>maxi) return false;
            maxi=Math.max(maxi , arr[i]+i);

            if(maxi>=n-1) return true;
        }

        return true;
        
    }
    public static void main(String[] args) {
        int arr[] = {3,2,1,0,4};
        System.out.println(isPossible(arr));
    }
}
