public class RegularExpressionMatchingRecursion {

    public static boolean findMatch(int idx1, int idx2, String s1, String s2){

        //base case
        if(idx2<0) return idx1<0;

        if(idx1<0){
            if(s2.charAt(idx2)=='*'){
                return findMatch(idx1, idx2-2, s1, s2);
            }
            return false;
        }

        // * case
        if(s2.charAt(idx2)=='*'){
            boolean first = findMatch(idx1, idx2-2, s1, s2);

            if(idx2-1>=0 && s2.charAt(idx2-1)=='.' || s2.charAt(idx2-1)==s1.charAt(idx1)){
                boolean second = findMatch(idx1-1, idx2, s1, s2);
                return first||second;
            }

            return first;
        }

        // . and == 
        if(s2.charAt(idx2)=='.' || (s1.charAt(idx1)==s2.charAt(idx2))){
            return findMatch(idx1-1, idx2-1, s1, s2);
        }
        
        return false;
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = ".*";

        int n1 = s1.length();
        int n2 = s2.length();

        boolean res = findMatch(n1-1,n2-1,s1,s2);
        System.out.println(res);
    }
}
