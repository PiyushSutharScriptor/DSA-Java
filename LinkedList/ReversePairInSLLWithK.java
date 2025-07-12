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

public class ReversePairInSLLWithK {

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
    
    public static Node reversePair(Node head, int k){
        if(head==null || k==1) return head;
        
        Node temp = head;
        Node kthNode = head;
        Node prevNode = null;
        
        while(temp!=null){
            kthNode = findKthNode(temp,k);
            if(kthNode==null){
                if(prevNode!=null) prevNode.next = temp;
                break;
            }
                
            Node nextNode = kthNode.next;
            kthNode.next = null;
            
            reverseLL(temp);
            
            if(head==temp){
                head = kthNode;
            }
            else{
                prevNode.next = kthNode;
            }
            
            prevNode = temp;
            temp = nextNode;
        }
        
        return head;
    }
    
    public static Node findKthNode(Node temp,int k){
        int count = 1;
        while(temp!=null && count<k){
            temp = temp.next;
            count++;
        }
        return temp;
    }

    public static Node reverseLL(Node head){
        Node temp = head;
        Node prev = null;
        Node front = null;
        
        //main logic 
        while(temp!=null){
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        
        return prev;
        
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int k = 3;

        Node head = createLL(arr);

        head = reversePair(head,k);

        printLL(head);
    }
}
