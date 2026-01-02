import java.util.*;

public class LetterCasePermutation {

    public static void findPermutation(int idx, String s, List<String> res, String str) {

        // base case :
        if (idx == s.length()) {
            res.add(new String(str));
            return;
        }

        char ch = s.charAt(idx);

        if (Character.isDigit(ch)) {
            str += ch;
            findPermutation(idx+1, s, res, str);
        }
        else{
            char chl = Character.toUpperCase(ch);
            char chh = Character.toLowerCase(ch);
            
            String s1 = str+chl;
            String s2 = str+chh;
            findPermutation(idx+1,s,res, s1);
            findPermutation(idx+1,s,res, s2);
            s1 = s1.substring(0,s1.length()-1);
            s2 = s2.substring(0,s2.length()-1); 
        }
    } 

    public static void main(String[] args) {
        String s = "a1b2";

        List<String> res = new ArrayList<>();

        findPermutation(0, s, res, "");

        System.out.println(res);
    }
}
