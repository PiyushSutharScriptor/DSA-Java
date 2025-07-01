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

public class DeleteParticularElementFromLL {

    public static Node createLL(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i=1 ; i<arr.length; i++){
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

    public static Node deleteElement(Node head , int val){
        if(head==null) return null;

        if(head.data == val){
            head = head.next;
            return head;
        }

        Node temp = head;
        Node prev = null;

        while(temp!=null){
            if(temp.data == val){
                prev.next = prev.next.next;
                break;
            }

            prev = temp;
            temp = temp.next;
        }

        return head;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int val = 6;

        //LinkedList creation (before)
        Node head = createLL(arr);
        printLL(head);  

        System.out.println();

        //Deleting element (after)
        head = deleteElement(head,val);
        printLL(head);
    }
}
