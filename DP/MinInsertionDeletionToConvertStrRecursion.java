public class MinInsertionDeletionToConvertStrRecursion {

    public static int findCount(int idx1, int idx2, String s1, String s2){

        if(idx1<0 || idx2<0) return 0;

        if(s1.charAt(idx1)==s2.charAt(idx2)){
            return 1 + findCount(idx1-1, idx2-1, s1, s2);
        }
        
        return 0 + Math.max(findCount(idx1-1, idx2, s1, s2) , findCount(idx1, idx2-1, s1, s2));

    }
    public static void main(String[] args) {
        String s1 = "kitten";
        String s2 = "sitting";

        int m = s1.length();
        int n = s2.length();

        int res = findCount(m-1,n-1,s1,s2);
        int ans = m+n - 2*(res); //m-res+n-res = m+n-2*(res) 
        System.out.println(ans);
    }
}
