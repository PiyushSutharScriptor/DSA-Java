//Output: "abab"

public class LongestHappyPrefixBrute {
    public static void main(String[] args) {
        String s = "ababab";
        int n = s.length(); 

        //Prefix : 
        String[] prefix = new String[n];
        for(int i=0 ; i<n ; i++){
            String str = s.substring(0, i+1);
            prefix[i] = str;
        }

        //suffix : 
        String[] suffix = new String[n];
        for(int i=n-1 ; i>=0 ; i--){
            String str = s.substring(i,n);
            suffix[n-1-i] = str;
        }



        int res = -1;
        for(int i=0 ; i<n-1 ; i++){
            if(prefix[i].equals(suffix[i])) res=i;
        }

        System.out.println(res);
        System.out.println(suffix[res]);
    }
}
