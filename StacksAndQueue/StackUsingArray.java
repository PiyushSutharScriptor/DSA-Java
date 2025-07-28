public class StackUsingArray{
    private int top;
    private int n;
    private int[] st;
        
    public StackUsingArray(int size){
        top = -1;
        n = size;
        st = new int[size];
    }
    
    public void push(int el){
        if(top>=n-1) return;

        top++;
        st[top] = el;
    }

    public void pop(){
        if(top>-1){
            top--;
        }
    }
    
    public int size(){
        return top+1;
    }

    public int top(){
        return st[top];
    }

    public boolean isEmpty(){
        if(top<0){
            return true;
        }
        return false;

        //one line code : 
        // return top<0;
    }

    public static void main(String[] args) {
        int n = 2;
        StackUsingArray s1 = new StackUsingArray(n);

        //push
        s1.push(2);
        s1.push(4);        

        //top or peek
        System.out.println(s1.top());

        //pop
        s1.pop();

        //top or peek
        System.out.println(s1.top());

        //size
        System.out.println(s1.size());

        //isEmpty
        System.out.println(s1.isEmpty());
    }
}