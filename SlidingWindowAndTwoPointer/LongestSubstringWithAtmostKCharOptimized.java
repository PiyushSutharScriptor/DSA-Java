import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithAtmostKCharOptimized {
    public static void main(String[] args) {
        String s = "aaabbccd";
        int k = 2;

        int n = s.length();
        Map<Character,Integer> map = new HashMap<>();
        int count = 0;
        int l = 0;

        for(int r=0 ; r<n ; r++){
            char ch = s.charAt(r);
            map.put(ch, map.getOrDefault(ch, 0)+1);

            if(map.size()>k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l))==0){
                    map.remove(s.charAt(l));
                }
                l++;
            }
            if(map.size()<=k){
                int len = r-l+1;
                count = Math.max(count,len);
            }

        }


        System.out.println(count);
    }
}
