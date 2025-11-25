// Output: "dcbabcd"

public class ShortestPalindromeBasic {
    public static void main(String[] args) {
        String s = "abcd";
        int n = s.length();

        int i=0;
        int j=n-1;

        String temp = "";
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                temp+=s.charAt(i);
                i++;
                j--;
            }
            else{
                temp+=s.charAt(j);
                j--;
            }
        }
        temp+=s.charAt(i);

        String temp2 = temp;
        for(int k=temp.length()-2 ; k>=0 ; k--){
            temp += temp2.charAt(k);
        }

        // System.out.println(temp2);
        // System.out.println(s);
        System.out.println(temp);
    }
}
