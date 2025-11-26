public class FindSufix {
    public static void main(String[] args) {
        String s = "abcdeabcd";
        int n = s.length();

        String[] suffix = new String[n];
        for(int i=n-1 ; i>=0 ; i--){
            String str = s.substring(i,n);
            suffix[n-1-i] = str;
        }

        for(String el : suffix){
            System.out.println(el);
        }
    }
}
