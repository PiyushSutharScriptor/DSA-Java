public class EditDistanceRecursion2{

    public static int findMin(int idx1, int idx2, String s1,    String s2){
        //base cases
        if(idx1<0){
            return idx2+1;
        }
        if(idx2<0){
            return idx1+1;
        }
        if(idx2<0 && idx1<0) return 0;

        if(s1.charAt(idx1)==s2.charAt(idx2)){
            return findMin(idx1-1, idx2-1, s1, s2);
        }
        return Math.min( 
            Math.min(
            1+findMin(idx1, idx2-1, s1, s2),
            1+findMin(idx1-1, idx2-1, s1, s2)
            ),
            1+findMin(idx1-1, idx2, s1, s2)
        );
    }

    public static void main(String[] args) {
        String s1 = "sea";
        String s2 = "ate";

        int n1 = s1.length();
        int n2 = s2.length();

        if(s1.length()==0){
            System.out.println(s2.length());
        } 
        else if(s2.length()==0){
            System.out.println(s1.length());
        }
        else{
            int res = findMin(n1-1, n2-1, s1, s2);
            System.out.println(res);
        }
    }
}

