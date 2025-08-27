public class CandyGreedyBetter {
    public static void main(String[] args) {
        int arr[] = {0,2,4,3,2,1,1,3,5,6,4,0,0};

        int n = arr.length;

        int l[] = new int[n];
        l[0] = 1;

        int count = 1;

        for(int i=1 ; i<n ; i++){
            if(arr[i]>arr[i-1]){
                count++;
                l[i] = count;
            }
            else{
                count=1;
                l[i] = count;
            }
        }

        count = 1;
        int candy = 0;

        for(int i=n-2 ; i>=0 ; i--){
            if(arr[i]>arr[i+1]){
                count++;
            }
            else{
                count = 1;
            }
            candy+=Math.max(l[i] , count);
        }


        System.out.println(candy+1); //the last candy (n-1) was not added 

        // here TC = O(2N) and SC = O(N) for l[] and the max loop , 
        // we eliminated the r[] 
    }    
}
