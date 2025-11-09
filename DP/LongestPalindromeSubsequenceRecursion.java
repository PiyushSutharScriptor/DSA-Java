public class LongestPalindromeSubsequenceRecursion {

    public static int findMax(int idx1, int idx2, String s1, String s2){
        if(idx1<0 || idx2<0) return 0;

        if(s1.charAt(idx1)==s2.charAt(idx2)){
            return 1+findMax(idx1-1, idx2-1, s1, s2);
        }
        else{
            return Math.max(findMax(idx1-1, idx2, s1, s2) , findMax(idx1, idx2-1, s1, s2));
        }
    }

    public static void main(String[] args) {
        String s1 = "bbbab";

        String s2 = new StringBuilder(s1).reverse().toString();
        int n = s1.length();

        int res = findMax(n-1, n-1, s1, s2);
        System.out.println(res);
    }
}
