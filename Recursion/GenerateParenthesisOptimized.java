import java.util.*;

class GenerateParenthesisOptimized {
    public static void generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        backtrack(result,current, 0, 0, n);
        
        for(String s : result){
            System.out.println(s);
        }
    }

    public static void backtrack(List<String> result, StringBuilder current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current.toString());
            return;
        }

        if (open < max) {
            current.append('(');
            backtrack(result, current , open + 1, close, max);
            current.setLength(current.length()-1);
        }

        if (close < open) {
            current.append(')');
            backtrack(result, current, open, close + 1, max);
            current.setLength(current.length()-1);
        }
    }
    
    public static void main(String[] args){
        int n = 3;
        generateParenthesis(n);
    }
}
