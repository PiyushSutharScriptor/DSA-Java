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

public class RotateASLLWithKOptimized {

    public static Node createLL(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i=1 ; i<arr.length ; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }

    public static void printLL(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    public static Node rotateAll(Node head, int k){
        if(head==null || head.next==null) return head;
        
        Node temp = head;
        int count = 0;
        
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        
        if(k>count) k = k%count;
        
        if(k==0) return head;
        
        int target = count-k;
        
        if(target==0) return head;
        
        temp = head;
        count = 0;
        
        while(count<target-1){
            count++;
            temp = temp.next;
        }
        
        
        Node newNode = temp.next;
        temp.next = null;
        
        Node tail = newNode;
        
        while(tail.next!=null){
            tail = tail.next;
        }
        
        tail.next = head;
        
        return newNode;
        
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k = 3;

        Node head = createLL(arr);

        head = rotateAll(head,k);

        printLL(head);
    }
}
