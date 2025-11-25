public class IdxOfFirstOccurrence{

    public static int match(String a, String b){
        int m = a.length();
        int n = b.length();

        if(m==0) return 0;
        if(n>m) return -1;

        for(int i=0 ; i<=m-n ; i++){
            if(a.substring(i,i+n).equals(b)){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        
        int res = match(haystack,needle);
        System.out.println(res);
    }
}