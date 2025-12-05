public class ValidPalindrome1 {

    public static boolean vPalindrome(String s){
        String str = s.toLowerCase().trim();

        int l = 0;
        int r = str.length()-1;

        while(l<r){
            char ch1 = str.charAt(l);
            char ch2 = str.charAt(r);

            boolean b1 = (ch1>='a' && ch1<='z') || (ch1>='0' && ch1<='9');
            boolean b2 = (ch2>='a' && ch2<='z') || (ch2>='0' && ch2<='9');

            if(b1 && b2){
                if(ch1!=ch2) return false;
                l++;
                r--;
            }
            else if(b1) r--;
            else l++;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "0P";
        System.out.println(vPalindrome(s));
    }    
}
