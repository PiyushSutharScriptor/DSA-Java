public class WildCardMatchingRecursion {

    public static boolean findMatch(int idx1, int idx2, String s1, String s2){

        if(idx1<0 && idx2<0) return true;
        if(idx1<0 && idx2>=0) return false;
        if(idx1>=0 && idx2<0){
            for(int i=0 ; i<=idx1 ; i++){
                if(s1.charAt(i)!='*') return false;
            }
            return true;
        }

        if(s1.charAt(idx1)==s2.charAt(idx2) || s1.charAt(idx1)=='?'){
            return findMatch(idx1-1, idx2-1, s1, s2);
        }
        else{
            if(s1.charAt(idx1)=='*'){
                return findMatch(idx1-1, idx2, s1, s2) || findMatch(idx1, idx2-1, s1, s2);
            }
        }

        return false;
        
    }
    public static void main(String[] args) {
        String s1 = "x?y*z";
        String s2 = "xaylmz";

        int m = s1.length();
        int n = s2.length();

        System.out.println(findMatch(m-1, n-1, s1, s2));
    }
}
