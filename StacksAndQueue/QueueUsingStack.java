import java.util.*;

public class QueueUsingStack {
    private Stack<Integer> st = new Stack<>();

    public void push(int x) {
        if(st.isEmpty()){
            st.push(x);
            return;
        }

        int top = st.pop();
        push(x);
        st.push(top);
    }
    
    public int pop() {
        return st.pop();
    }
    
    public int peek() {
        return st.peek();
    }
    
    public boolean empty() {
        return st.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStack s1 = new QueueUsingStack();

        s1.push(10);
        s1.push(10);
        s1.push(10);

        System.out.println(s1.peek());

        System.out.println(s1.pop());

        System.out.println(s1.empty());
    }
}
