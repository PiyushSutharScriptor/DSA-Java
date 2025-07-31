import java.util.Stack;

public class MinStackOptimized {
    private Stack<Integer> st = new Stack<>();
    private int mini = Integer.MAX_VALUE;

    public void push(int val) {
        if(st.isEmpty()){
            st.push(val);
            mini = val;
        }
        else{
            if(val<mini){
                int newVal = 2*val-mini;
                st.push(newVal);
                mini = val;
            }
            else{
                st.push(val);
            }
        }
    }
    
    public void pop() {
        if(st.isEmpty()) return;

        int top = st.pop();

        if(top<mini){
            mini = 2*mini-top;
        }
    }
    
    public int top() {
        if(st.peek()<mini){
            return mini;
        }
        else{
            return st.peek();
        }
    }
    
    public int getMin() {
        return mini;
    }

    public void printSt(){
        System.out.print(st);
    }
    public static void main(String[] args) {
        MinStackOptimized s1 = new MinStackOptimized();
        s1.push(12);
        s1.push(15);
        s1.push(10);

        s1.printSt();

        System.out.println();
        System.out.println(s1.getMin());
        

        s1.pop();
        s1.printSt();

        System.out.println();
        
        System.out.println(s1.getMin());
        System.out.println(s1.top());
    }
}
