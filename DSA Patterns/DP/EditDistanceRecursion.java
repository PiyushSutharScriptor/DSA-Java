public class EditDistanceRecursion{

    public static int findMin(int idx1, int idx2, String s1,    String s2){
        //base 
        if(idx1<0 || idx2<0) return 0;

        if(s1.charAt(idx1)==s2.charAt(idx2)){
            return 0+findMin(idx1-1, idx2-1, s1, s2);
        }
        else if(idx1-1>=0 && s1.charAt(idx1-1)==s2.charAt(idx2)){
            return 1+findMin(idx1-1, idx2, s1, s2);
        }
        return 1+findMin(idx1-1, idx2-1, s1, s2);
    }

    public static void main(String[] args) {
        String s1 = "";
        String s2 = "execution";

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