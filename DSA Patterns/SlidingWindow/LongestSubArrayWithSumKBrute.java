public class LongestSubArrayWithSumKBrute {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,6};
        int k = 8;
        
        int n = arr.length;

        int len = 0;
        for(int i=0 ; i<n ; i++){

            int count = 0;
            for(int j=i ; j<n ; j++){
                count+=arr[j];
                if(count<=k){
                    len = Math.max(j-i+1,len);
                }
            }
        }

        System.out.println(len);
    }
}
