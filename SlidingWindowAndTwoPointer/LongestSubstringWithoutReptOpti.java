import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutReptOpti {
    public static void main(String[] args) {
        String s = "cadbzabcd";

        int n = s.length();
        Map<Character,Integer> map = new HashMap<>();
        int count = 0;

        int l=0;

        for(int r=0 ; r<n ; r++){
            int len = 0;

            char ch = s.charAt(r);

            if(map.containsKey(ch)){
                if(map.get(ch)>=l){
                    l = map.get(ch)+1;
                }
            }
            map.put(ch,r);

            len = r-l+1;
            count = Math.max(len,count);
            
        }

        System.out.println(count);
    }
}
