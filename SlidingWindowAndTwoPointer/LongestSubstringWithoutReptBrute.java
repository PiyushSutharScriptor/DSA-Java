public class LongestSubstringWithoutReptBrute {
    public static void main(String[] args) {
        String s = "cadbzabcd";

        int n = s.length();

        int length=0;
        for(int i=0 ; i<n ; i++){
            int arr[] =new int[255];
            for(int j=i ; j<n ; j++){
                if(arr[s.charAt(j)]==1) break;
                length = Math.max(length,j-i+1);
                arr[s.charAt(j)]=1;
            }
        }

        System.out.println(length);
    }
}
