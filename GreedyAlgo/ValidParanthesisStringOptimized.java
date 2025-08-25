public class ValidParanthesisStringOptimized {
    public static boolean findValid(String s){
        int n = s.length();
        
        int min = 0;
        int max = 0;

        for(int i=0 ; i<n ; i++){
            char ch = s.charAt(i);

            if(ch=='('){
                min++;
                max++;
            }
            else if(ch==')'){
                min--;
                max++;
            }
            else{
                min--;
                max++;
            }
            if(min<0) min=0;
            if(max<0) return false;
        }
        
        return min==0; //if min has 0 then true is returned
    }
    public static void main(String[] args) {
        String s = "(**()";
        System.out.println(findValid(s));
    }
}
