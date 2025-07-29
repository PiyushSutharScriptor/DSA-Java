import java.util.Stack;

public class QueueUsingStackOptimized {
    private Stack<Integer> st = new Stack<>();
    private Stack<Integer> st2 = new Stack<>();

    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        if(st2.isEmpty()){
            while(!st.isEmpty()){
                st2.push(st.pop());
            }
        }
        return st2.pop();
    }
    
    public int peek() {
        if(st2.isEmpty()){
            while(!st.isEmpty()){
                st2.push(st.pop());
            }
        }
        return st2.peek();
    }
    
    public boolean empty() {
        return st.isEmpty();
    }

    public void printQueue(){
        System.out.print(st);
        System.out.print(st2);
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingStackOptimized s1 = new QueueUsingStackOptimized();

        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println(s1.peek());
        s1.printQueue();
        s1.push(40);
        s1.push(50);
        System.out.println(s1.peek());


        System.out.println(s1.pop());

        System.out.println(s1.empty());
    }
}
