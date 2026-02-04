public class LongestCommonSubsequence{

    public static int findMax(String s1, String s2, int idx1, int idx2){ 
        //base case
        if(idx1<0 || idx2<0) return 0;

        int match = 0;
        int notMatch = 0;

        if(s1.charAt(idx1)==s2.charAt(idx2)){
            match = 1 + findMax(s1,s2,idx1-1,idx2-1);
        }
        else{
            notMatch = 0 + Math.max(findMax(s1,s2,idx1-1,idx2),findMax(s1,s2,idx1,idx2-1));
        }

        return match+notMatch;
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";

        int n1 = s1.length();
        int n2 = s2.length();

        int res = findMax(s1,s2,n1-1,n2-1);
        System.out.println(res);
    }
}