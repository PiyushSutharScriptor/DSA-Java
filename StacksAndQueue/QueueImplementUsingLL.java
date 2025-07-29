class Node{
    int data;
    Node next;

    Node(int data1 , Node next1){
        this.data = data1;
        this.next = next1;
    }
    
    Node(int data2){
        this.data = data2;
        this.next = null;
    }
}
public class QueueImplementUsingLL {

    private int s = 0;
    private Node top = new Node(-1);
    private Node mover = top;

    public int size(){
        return s;
    }

    public void add(int el){
        Node temp = new Node(el);
        mover.next = temp;
        mover = temp;
        s++;
    }

    public int peek(){
        return top.next.data;
    }

    public void remove(){
        if(size()==0) return;

        top.next = top.next.next;
        s--;

        if(top.next==null){
            mover = top;
        }
    }

    public void printQueue(){
        Node temp = top.next;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueImplementUsingLL ql = new QueueImplementUsingLL();

        ql.add(10);
        ql.add(20);
        ql.add(30);
        
        ql.printQueue();
        
        ql.add(40);
        ql.add(50);

        ql.printQueue();
        

        System.out.println(ql.size());
        System.out.println(ql.peek());
    }
}
