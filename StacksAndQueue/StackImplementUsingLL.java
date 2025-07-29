class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }

    Node(int data2){
        this.data = data2;
        this.next = null;
    }
}
public class StackImplementUsingLL {
    private int size=0;
    private Node top = new Node(-1);
    private Node mover = top;
    
    public void push(int el){
        Node temp = new Node(el);
        mover.next = temp;
        mover = temp;
        size++;
    }

    public void pop(){
        if(size==0) return;
        
        if(top.next.next == null){
            top.next = null;
            mover = top;
            size--;
            return;
        }

        Node temp = top.next;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next=null;
        mover = temp;
        size--;

    }

    public void size(){
        System.out.println(size);
    }

    public void printStack(){
        Node temp = top.next;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public int peek(){
        return mover.data;
    }

    public static void main(String[] args) {
        StackImplementUsingLL sl = new StackImplementUsingLL();
        sl.push(10);
        sl.push(20);
        sl.push(30);
        sl.push(40);
        sl.push(50);
        sl.size();
        sl.printStack();
        System.out.println();
        System.out.println(sl.peek());
        
        sl.pop();
        sl.printStack();
        
        System.out.println();

        System.out.println(sl.peek());
        
    }
}
