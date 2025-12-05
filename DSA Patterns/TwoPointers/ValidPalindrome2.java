public class ValidPalindrome2 {

    public static boolean vPalindrome(String s){
        int n = s.length();

        int l = 0;
        int r = n-1;
        int count = 0;

        while(l<r){
            char ch1 = s.charAt(l);
            char ch2 = s.charAt(r);

            if(ch1!=ch2){
                count++;

                if(count==2) return false;

                if (l + 1 <= r && s.charAt(l + 1) == ch2) {
                    l++;        
                } 
                else if (r - 1 >= l && s.charAt(r - 1) == ch1) {
                    r--;        
                } 
                else {
                    return false;
                }
            }
            else{
                l++;
                r--;
            }
        }

        return true;
            
    }

    public static void main(String[] args) {
        String s = "0P";
        System.out.println(vPalindrome(s));
    }    
}
