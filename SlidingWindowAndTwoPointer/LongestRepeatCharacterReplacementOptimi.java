public class LongestRepeatCharacterReplacementOptimi {
    public static void main(String[] args) {
        String s = "AAABAABBA";
        int k = 2;

        int n = s.length();
        int maxf = 0;
        int count = 0;

        int l=0;
        int arr[] = new int[26];

        for(int r=0 ; r<n ; r++){
            arr[s.charAt(r)-'A']++;
            maxf = Math.max(maxf,arr[s.charAt(r)-'A']);

            if((r-l+1)-maxf>k){
                arr[s.charAt(l)-'A']--;
                l++;
            }

            int len = (r-l+1)-maxf;
            if(len<=k){
                count = Math.max(count,r-l+1);
            }   

        }

        System.out.println(count);
    }
}
