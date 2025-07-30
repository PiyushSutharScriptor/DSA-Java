import java.util.*;

public class MinStackBrute{
    
    private Stack<Integer> st = new Stack<>();
    
    public void push(int val) {
        st.push(val);
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;

        // tc = O(n)
        for(int i=0 ; i<st.size() ; i++){
            if(st.elementAt(i)<min) min = st.elementAt(i);
        }        

        return min;
    }
    public static void main(String[] args) {
        MinStackBrute s1 = new MinStackBrute();
        s1.push(10);
        s1.push(20);
        s1.push(30);

        System.out.println(s1.getMin());
    }
}