import java.util.*;

public class StackUsingQueue {

    private Queue<Integer> que = new LinkedList<>();

    public void push(int x){
        int s = que.size();
        que.add(x);

        for(int i=1; i<=s ; i++){
            que.add(que.peek());
            que.remove();
        }
    }

    public int pop(){
        return que.remove();
    }

    public int top(){
        return que.peek();
    }

    public boolean isEmpty(){
        return que.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueue q = new StackUsingQueue();

        q.push(50);
        q.push(50);
        q.push(50);

        System.out.println(q.top());
        System.out.println(q.isEmpty());

        System.out.println(q.pop());

    }
}
