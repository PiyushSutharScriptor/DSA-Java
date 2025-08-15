import java.util.*;

public class LongestSubstringWithAtmostKCharBrute {
    public static void main(String[] args) {
        String s = "aaabbccd";
        int k = 2;

        int n = s.length();
        Map<Character,Integer> map = new HashMap<>();
        int count = 0;

        for(int i=0 ; i<n ; i++){
            int len = 0;
            map.clear();
            for(int j=i ; j<n ; j++){
                char ch = s.charAt(j);
                map.put(ch,map.getOrDefault(ch,0)+1);

                if(map.size()<=k){
                    len = j-i+1;
                    count = Math.max(count,len);
                }
                else break;
            }
        }


        System.out.println(count);
    }
}
