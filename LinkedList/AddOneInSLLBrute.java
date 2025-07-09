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

public class AddOneInSLLBrute {

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
        head = reverseLL(head);
        
        int carry = 1;
        int total = 0;
        
        Node temp = head;
        while(temp!=null){
            total = temp.data+carry;
            if(total<10){
                temp.data = total;
                carry = 0;
                break;
            }
            else{
                temp.data = total%10;
                carry = total/10;
            }
            
            temp = temp.next;
        }
        
        head = reverseLL(head);
        
        if(carry>0){
            Node newNode = new Node(carry);
            newNode.next = head;
            return newNode;
        }
        
        return head;
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
        int arr[] = {1,2,9};

        Node head = createLL(arr);

        head = addOneLL(head);

        printLL(head);
    }
}
