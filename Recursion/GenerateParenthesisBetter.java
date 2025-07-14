import java.util.*;

class GenerateParenthesisBetter {
    public static void generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        
        for(String s : result){
            System.out.println(s);
        }
    }

    public static void backtrack(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }

        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }
    
    public static void main(String[] args){
        int n = 3;
        generateParenthesis(n);
    }
}
