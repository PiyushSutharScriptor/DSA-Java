public class EvaluateBooleanExpressionTrueRecursion {

    public static int findWays(int i, int j, int isTrue, String str){

        if(i>j) return 0;
        if(i==j){
            if(isTrue==1) return str.charAt(i)=='T' ? 1 : 0;
            else return str.charAt(i)=='F' ? 1 : 0;
        }
        
        int ways = 0;

        for(int ind=i+1 ; ind<=j-1 ; ind+=2){
            int lt = findWays(i, ind-1, 1, str);
            int lf = findWays(i, ind-1, 0, str);
            int rt = findWays(ind+1, j, 1, str);
            int rf = findWays(ind+1, j, 0, str);

            if(str.charAt(ind)=='&'){
                // t&t=t , t&f=f , f&t=f , f&f=f
                if(isTrue==1) ways += rt*lt;
                else ways += (lt*rf) + (rt*lf) + (rf*lf);
            }
            else if(str.charAt(ind)=='|'){
                //t|t=t , t|f=t , f|t=t , f|f=f
                if(isTrue==1) ways += (lt*rt) + (rf*lt) + (rt*lf);
                else ways += (lf*rf);
            }
            else{
                // t^t=f , f^t=t , t^f=t , f^f=f
                if(isTrue==1) ways += (rf*lt) + (rt*lf);
                else ways += (rt*lt) + (rf*lf);
            }
        }

         return ways;
    }
    public static void main(String[] args) {
        String str = "T|T&F^T";
        int n = str.length();

        int res = findWays(0,n-1,1,str);
        System.out.println(res);
    }
}
