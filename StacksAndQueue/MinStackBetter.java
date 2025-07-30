import java.util.*;

public class MinStackBetter {
    private Stack<Map.Entry<Integer,Integer>> st = new Stack<>();
    private int mini = Integer.MAX_VALUE;

    public void push(int val) {
        mini = Math.min(val, mini);
        st.push(new AbstractMap.SimpleEntry<>(val,mini));
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().getKey();
    }
    
    public int getMin() {
        return st.peek().getValue();
    }
    public static void main(String[] args) {
        MinStackBetter s1 = new MinStackBetter();
        s1.push(10);
        s1.push(20);
        s1.push(30);

        System.out.println(s1.getMin());
    }
}
