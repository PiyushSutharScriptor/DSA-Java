public class QueueUsingArrayOptimized {
    private int n;
    private int[] que;
    private int start; //this is front (inserted from front/top)
    private int end;   //this is rear (removed from rear)

    public QueueUsingArrayOptimized(int size){
        n = size;
        que = new int[size];
        start = -1;
        end = 0;
    }

    public void add(int el){
        if(start>=n-1) return;
        start++;
        que[start] = el;
    }

    public void remove(){
        if(isEmpty()) return;
        end++;
    }

    public int top(){
        if(isEmpty()) return -1;
        return que[end];
    }

    public int size(){
        return start+1-end;
    }

    public boolean isEmpty(){
        return end>start;
    }
    
    public static void main(String[] args) {
        int n = 3;
        QueueUsingArrayOptimized q1 = new QueueUsingArrayOptimized(n);

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
