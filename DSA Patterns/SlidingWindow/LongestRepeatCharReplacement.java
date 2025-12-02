import java.util.*;

public class LongestRepeatCharReplacement {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;

        int  n = s.length();

        int l = 0;
        int freq = 0;
        int maxi = 0;
        Map<Character,Integer> map = new HashMap<>();

        for(int r=0 ; r<n ; r++){
            char ch = s.charAt(r);

            map.put(ch,map.getOrDefault(ch,0)+1);
            freq = Math.max(freq,map.get(ch));

            while(((r-l+1) - freq) > k){
                char lchar = s.charAt(l);
                map.put(lchar,map.get(lchar)-1);
                l++;
            }

            maxi = Math.max(r-l+1 , maxi);
        }

        System.out.println(maxi);
    }
}
