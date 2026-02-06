import java.util.*;

public class LongestPalindromicSubstring {

    public static int findMax(int idx1, int idx2, String s1, String s2, StringBuilder ans){

        if(idx1<0 || idx2<0) return 0;

        if(s1.charAt(idx1)==s2.charAt(idx2)){
            ans.append(s1.charAt(idx1));
            return 1+findMax(idx1-1, idx2-1, s1, s2,ans);
        }

        return Math.max(findMax(idx1-1, idx2, s1, s2, ans),findMax(idx1, idx2-1, s1, s2, ans));

    }
    public static void main(String[] args) {
        String str = "babad";

        String str2 = new StringBuilder(str).reverse().toString();

        StringBuilder ans = new StringBuilder();

        int n = str.length();

        int res = findMax(n-1,n-1,str,str2,ans); 
        System.out.println(res); 
        System.out.println(ans);
    }    
}