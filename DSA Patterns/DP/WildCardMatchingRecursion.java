public class WildCardMatchingRecursion{

    public static boolean findMat(int idx1, int idx2, String s, String p){
        //base cases 

        //i and j exhausted
        if(idx1<0 && idx2<0) return true;

        // i exhausted
        if(idx2<0 && idx1>=0) return false;

        //j exhausted
        if(idx1<0 && idx2>=0){
            if(p.charAt(idx2)=='*'){
                return findMat(idx1, idx2-1, s, p);
            }
            return false;
        }


        if(p.charAt(idx2)=='*'){
            return findMat(idx1-1, idx2, s, p) || 
                    findMat(idx1, idx2-1, s, p);
        }

        if((s.charAt(idx1)==p.charAt(idx2)) || (p.charAt(idx2)=='?')){
            return findMat(idx1-1, idx2-1, s, p);
        }

        return false;
    }

    public static void main(String[] args) {
        String s1 = "abdefcd";
        String s2 = "ab*cd";

        int n1 = s1.length();
        int n2 = s2.length();

        boolean res = findMat(n1-1, n2-1, s1, s2);
        System.out.println(res);
    }
}