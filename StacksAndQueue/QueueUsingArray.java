public class QueueUsingArray {
    private int n;
    private int[] que;
    private int top; //this is front (inserted from front/top)
    private int r;   //this is rear (removed from rear)

    public QueueUsingArray(int size){
        n = size;
        que = new int[size];
        top = -1;
        r = 0;
    }

    public void add(int el){
        if(top>=n-1) return;
        top++;
        que[top] = el;
    }

    public void remove(){
        if(isEmpty()) return;
        r++;
    }

    public int top(){
        if(isEmpty()) return -1;
        return que[r];
    }

    public int size(){
        return top+1-r;
    }

    public boolean isEmpty(){
        return r>top;
    }
    
    public static void main(String[] args) {
        int n = 3;
        QueueUsingArray q1 = new QueueUsingArray(n);

        q1.add(10);
        q1.add(20);
        q1.add(30);

        System.out.println(q1.top());

        q1.remove();
        q1.remove();

        System.out.println(q1.top());

        System.out.println(q1.size());

        System.out.println(q1.isEmpty());
    }
}
