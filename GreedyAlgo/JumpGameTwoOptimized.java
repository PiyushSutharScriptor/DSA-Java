public class JumpGameTwoOptimized {
    public static void main(String[] args) {
        int arr[] = {2,3,1,4,1,1,1,2};
        int n = arr.length;

        int l = 0;
        int r = 0;
        int jump = 0;

        while(r<n-1){
            int far = 0;

            for(int i=l ; i<=r ; i++){
                far = Math.max(i+arr[i] , far);
            }

            l=r+1;
            r=far; 
            
            jump++;
        }

        System.out.println(jump);
    }
}
