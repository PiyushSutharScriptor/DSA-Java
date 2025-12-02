import java.util.*;

public class LongestSubstringWithoutRepeat {
    public static void main(String[] args) {
        String s = "abcabcbb";

        int n = s.length();

        Map<Character,Integer> map = new HashMap<>();
        int l = 0;
        int r=0;
        int maxi = 0;

        while(r<n){
            char ch = s.charAt(r);

            if(map.containsKey(ch)){
                if(map.get(ch)>=l){
                    l=map.get(ch)+1;
                }
            }

            map.put(ch,r);

            maxi = Math.max(maxi,r-l+1);
            r++;
        }

        System.out.println(maxi);

    }
}
