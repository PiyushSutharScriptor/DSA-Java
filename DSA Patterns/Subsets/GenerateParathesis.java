import java.util.*;

public class GenerateParathesis {

    public static void findCombi(int idx, List<String> res, StringBuilder str, int open , int close, int max){

        //base case : 
        if(idx==max*2){
            res.add(str.toString());
            return;
        }

        if(open<max){
            str.append('(');
            findCombi(idx+1, res, str, open+1, close, max);
            str.setLength(str.length()-1);
        }
        if(close<open){
            str.append(')');
            findCombi(idx+1, res, str, open, close+1, max);
            str.setLength(str.length()-1);
        }
    }

    public static void main(String[] args) {
        int n = 3;

        List<String> res = new ArrayList<>();
        findCombi(0,res,new StringBuilder(),0,0,n);

        System.out.println(res);
    }
}
