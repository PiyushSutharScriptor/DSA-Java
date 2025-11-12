public class EditDistanceRecursion {

    public static int findMinEdit(int idx1, int idx2, String s1, String s2){
        if(idx1<0){
            return idx2+1;
        }

        if(idx2<0){
            return idx1+1;
        }

        if(s1.charAt(idx1)==s2.charAt(idx2)){
            return 0 + findMinEdit(idx1-1, idx2-1, s1, s2);
        }
        
        return Math.min(
            1 + findMinEdit(idx1, idx2-1, s1, s2),
            Math.min(
                1 + findMinEdit(idx1-1, idx2, s1, s2),
                1 + findMinEdit(idx1-1, idx2-1, s1, s2)
            )
        );
    }

    public static void main(String[] args) {
        String s1 = "abcdefg";
        String s2 = "azced";

        int m = s1.length();
        int n = s2.length();

        int res = findMinEdit(m-1, n-1, s1, s2);
        System.out.println(res);

        //4
    }
}
