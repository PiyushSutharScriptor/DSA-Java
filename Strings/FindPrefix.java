public class FindPrefix{
    public static void main(String[] args) {
        String s = "abcdeabcd";
        int n = s.length();

        String[] prefix = new String[n];

        for(int i=0 ; i<n ; i++){
            String str = s.substring(0, i+1);
            prefix[i] = str;
        }

        for(String el : prefix){
            System.out.println(el);
        }
    }
}