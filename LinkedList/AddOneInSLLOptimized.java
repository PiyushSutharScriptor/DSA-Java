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

public class AddOneInSLLOptimized {

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
    
    public static Node addOneLL(Node head){
        int carry = returnCarry(head);    
        
        if(carry==0) return head;
        Node newNode = new Node(carry);
        newNode.next = head;
        return newNode;
    }

    public static int returnCarry(Node temp){
        if(temp==null){
            return 1;
        }
        
        int n = returnCarry(temp.next);
        
        int total = temp.data+n;
        
        if(total<10){
            temp.data = total;
            return 0;
        }
        else{
            temp.data = total%10;
            return total/10;
        }
    }

    public static void main(String[] args) {
        int arr[] = {9,9,9};
    
        Node head = createLL(arr);

        head = addOneLL(head);

        printLL(head);
    }
}
