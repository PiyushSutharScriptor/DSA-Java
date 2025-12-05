import java.util.*;

public class PermutationInStringBrute {

    public static String sort(String s){
        char[] c1 = s.toCharArray();
        Arrays.sort(c1);

        s = new String(c1);
        return s;
    }

    public static boolean findPermutation(String s1, String s2) {
        
        int n = s1.length();
        String newS1 = sort(s1);

        for(int r=0 ; r<=s2.length()-n ; r++){
            String newS2 = sort(s2.substring(r, r+n));

            if(newS1.equals(newS2)){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidboaoo";

        System.out.println(findPermutation(s1, s2));

    }
}
