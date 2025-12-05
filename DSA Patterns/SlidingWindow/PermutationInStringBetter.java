public class PermutationInStringBetter {

    public static boolean findPer(String s1, String s2){

        int m = s1.length();
        int n = s2.length();

        if(m>n) return false;
        
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(int i=0 ; i<m ; i++){
            int x = s1.charAt(i)-'a';
            freq1[x]++;
            int y = s2.charAt(i)-'a';
            freq2[y]++;
        }

        for(int r=0 ; r<=n-m ; r++){
            boolean find = true;
            for(int i=0 ; i<26 ; i++){
                if(freq1[i]!=freq2[i]){
                    find = false;
                    break;
                }
            }
            if(find) return true;

            if(r+m<n){
                int start = s2.charAt(r)-'a';
                freq2[start]--;
                int end = s2.charAt(r+m)-'a';
                freq2[end]++;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidboaoo";

        System.out.println(findPer(s1, s2));
    }
}
