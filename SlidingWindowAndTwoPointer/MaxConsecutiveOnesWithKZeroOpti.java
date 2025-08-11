public class MaxConsecutiveOnesWithKZeroOpti {
    public static void main(String[] args) {
        int arr[] = {1,1,1,0,0,0,1,1,1,1};
        int target = 2;

        int n = arr.length;

        int count=0;
        int l=0;
        int countz=0;
        for(int r=0 ; r<n ; r++){
            if(arr[r]==0) countz++;

            while(countz>target){
                if(arr[l]==0) countz--;
                l++;
            }

            int len = r-l+1;
            count = Math.max(len,count);
        }

        System.out.println(count);

    }   
}
