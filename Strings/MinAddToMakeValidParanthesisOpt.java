public class MinAddToMakeValidParanthesisOpt{
    public static void main(String[] args) {
        String s  = "()))";
        int n = s.length();
        
        int open = 0;
        int close = 0;
        
        int res = 0;
        for(int i=0 ; i<n ; i++){
            char ch = s.charAt(i);
            
            if(ch=='(') open++;
            else{
                if(open>0){
                    open--;
                }
                else{
                    res++;
                }
            }
        }
        res+= open + close;
        
        System.out.println(res);
        
    }
}