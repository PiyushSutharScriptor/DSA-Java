public class MaxConsecutiveOnesWithKZeroBrute {
    public static void main(String[] args) {

        int arr[] = {1,1,1,0,0,0,1,1,1,1};
        int n = arr.length;
        int target = 2;

        int count = 0;

        for(int i=0 ; i<n ; i++){
            for(int j=i ; j<n ; j++){

                int countz = 0;

                for(int k=i ; k<=j ; k++){
                    if(arr[k]==0) countz++;
                }

                if(countz<=target){
                    int len = j-i+1;
                    count = Math.max(len,count);
                }

            }
        }

        System.out.println(count);
    }
}
