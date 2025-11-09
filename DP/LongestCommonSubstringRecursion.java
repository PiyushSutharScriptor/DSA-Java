public class LongestCommonSubstringRecursion {

    public static int len = 0;

    public static int findCount(int idx1, int idx2, String s1, String s2){

        if(idx1<0 || idx2<0) return 0;

        int same = 0;

        if(s1.charAt(idx1)==s2.charAt(idx2)){
            same = 1 + findCount(idx1-1, idx2-1, s1, s2);
        }
        
        len = Math.max(len,same);

        findCount(idx1-1, idx2, s1, s2);
        findCount(idx1, idx2-1, s1, s2);

        return same;
    }
    public static void main(String[] args) {
        String s1 = "abx";
        String s2 = "abc";

        int m = s1.length();
        int n = s2.length();

        findCount(m-1,n-1,s1,s2);
        System.out.println(len);
    }
}
