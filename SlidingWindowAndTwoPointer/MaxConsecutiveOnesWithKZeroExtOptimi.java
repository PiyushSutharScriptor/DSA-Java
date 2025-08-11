public class MaxConsecutiveOnesWithKZeroExtOptimi {
    public static void main(String[] args) {
        int arr[] = {0,0,0,1,1,1};
        int target = 1;

        int n = arr.length;

        int count=0;
        int l=0;
        int countz=0;
        for(int r=0 ; r<n ; r++){
            if(arr[r]==0) countz++;

            if(countz>target){
                if(arr[l]==0) countz--;
                l++;
            }
            else{
                int len = r-l+1;
                count = Math.max(count,len);
            }
        }

        System.out.println(count);
    }
}
