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

public class ReverseSingleLinkedListOptimi {

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

    public static Node reverseLL(Node head, int val){
        Node temp = head;
        Node prev = null;
        Node front = null;
        
        while(temp!=null){
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        
        return prev;
        
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int val = 10;

        Node head = createLL(arr);

        head = reverseLL(head,val);

        printLL(head);
    }
}
