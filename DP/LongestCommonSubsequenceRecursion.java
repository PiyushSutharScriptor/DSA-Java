public class LongestCommonSubsequenceRecursion {

    public static int findCount(int idx1, int idx2, String s1, String s2){

        if(idx1<0 || idx2<0) return 0;

        if(s1.charAt(idx1)==s2.charAt(idx2)){
            return 1 + findCount(idx1-1, idx2-1, s1, s2);
        }
        
        return 0 + Math.max(findCount(idx1-1, idx2, s1, s2) , findCount(idx1, idx2-1, s1, s2));

    }
    public static void main(String[] args) {
        String s1 = "bdefg";
        String s2 = "bfg";

        int m = s1.length();
        int n = s2.length();

        int res = findCount(m-1,n-1,s1,s2);
        System.out.println(res);
    }
}
