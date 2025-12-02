import java.util.*;

public class MinimumWindowSubstringBrute {

    public static boolean findLen(int l, int r, String s, String t){

        int m = t.length();

        Map<Character,Integer> map = new HashMap<>();
        for(int i=0 ; i<m ; i++){
            char ch = t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int k=l ; k<=r ; k++){
            char ch = s.charAt(k);
            if(map.containsKey(ch)){
                if(map.get(ch)>0){
                    map.put(ch, map.get(ch)-1);
                }
            }
        }

        for(int el : map.values()){
            if(el>0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        int n = s.length();
        int start = -1;
        int end = -1;

        int maxi = Integer.MAX_VALUE;
        for(int i=0 ; i<n ; i++){
            for(int j=i ; j<n ; j++){
                if(findLen(i,j,s,t)){
                    if(maxi>j-i+1){
                        maxi = Math.min(j-i+1,maxi);
                        start = i;
                        end = j;
                    }
                }
            }
        }

        System.out.println(maxi);
        System.err.println(s.substring(start, end+1));
    }
}
