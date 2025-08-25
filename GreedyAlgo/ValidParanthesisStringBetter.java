public class ValidParanthesisStringBetter {
    public static boolean findValid(String s , int i , int count){
        int n = s.length();

        if(count<0){
            return false;
        }
        if(i==n){
            return count==0;
        }
        if(s.charAt(i)=='('){
            return findValid(s, i+1, count+1);
        }
        else if(s.charAt(i)==')'){
            return findValid(s, i+1, count-1);
        }
        else{
            return findValid(s, i+1, count+1) || 
                   findValid(s, i+1, count-1) || 
                   findValid(s, i+1, count);
        }
        
    }
    public static void main(String[] args) {
        String s = "(**()";
        System.out.println(findValid(s,0,0));
    }
}
