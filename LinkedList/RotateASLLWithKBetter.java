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

public class RotateASLLWithKBetter {

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
        
        Node t1 = head;
        int target = 0;
        
        while(t1!=null){
            target++;
            t1 = t1.next;    
        }
        
        k = k%target;
        
        int count = 0;
        
        while(count<k){
            head = rotateK(head);
            count++;
        }
        
        return head;
    }
    
    public static Node rotateK(Node head){
        
        Node temp = head;
        
        while(temp.next.next!=null){
            temp = temp.next;
        }
        
        Node newNode = temp.next;
        newNode = temp.next;
        newNode.next = head;
        temp.next = null;
        
        return newNode;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int k = 3;

        Node head = createLL(arr);

        head = rotateAll(head,k);

        printLL(head);
    }
}
