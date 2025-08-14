public class SubStringContainingWabcBrute {
    public static void main(String[] args) {
        String s = "abcabc";
        int n = s.length();

        int count = 0;
        for(int i=0 ; i<n ; i++){
            String s1="";
            for(int j=i ; j<n ; j++){
                s1+=s.charAt(j);
                if(s1.contains("a") && s1.contains("b") && s1.contains("c")) count++;
            }
        }

        System.out.println(count);
    }
}
