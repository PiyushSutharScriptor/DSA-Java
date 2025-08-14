public class CountSubArryWithSumKBrute {
    public static void main(String[] args) {

        int arr[] = {1,0,1,0,1};
        int k  = 2;
        int count = 0;

        int n = arr.length;
        for(int i=0 ; i<n ; i++){
            int len = 0;
            for(int j=i ; j<n ; j++){
                len+=arr[j];
                if(len==k) count++;
            }
        }

        System.out.println(count);
    }

}
